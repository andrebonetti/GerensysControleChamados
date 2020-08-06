import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { PermissaoTipoService } from '../service/permissao-tipo.service';
import { TelaService } from '../service/tela.service';
import { UsuarioPerfilDTO } from '../models/usuarioPerfil'
import { usuarioPerfilPermissaoMOCK } from '../mock/mock-usuario-perfil-permissao'
import { UsuarioPerfilPermissaoDTO } from '../models/usuarioPerfilPermissao'
import { PermissaoTipoEnum } from '../models/enums/permissao_tipo'
import { UsuarioPerfilPermissaoTipoEntityDTO } from "../models/usuarioPerfilPermissaoTipoEntity";
import { UtilService } from "../service/util.service";
import { Observable, of } from 'rxjs';
import { FilaService } from "../service/fila.service";
import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo';

@Injectable({
  providedIn: 'root'
})
export class PermissaoService {

  constructor(
    private permissaoTipoService : PermissaoTipoService,
    private telaService : TelaService,
    private filaService : FilaService,
    private utilService : UtilService,
    private mensagemService: MensagemService
  ) { }

  getPermissoes(): Observable<UsuarioPerfilPermissaoDTO[]> {
    this.mensagemService.add('PermissaoService: permissoes obtidas');
    return of(usuarioPerfilPermissaoMOCK);
  }

  getPermissoesPerfil(perfil : UsuarioPerfilDTO): Observable<UsuarioPerfilPermissaoDTO[]> {
    this.mensagemService.add('PermissaoService: penrmissoes de perfil obtidas');
    return of(usuarioPerfilPermissaoMOCK.filter( usuario => usuario.usuarioPerfilDTO.id == perfil.id ));
  }

  getPermissoesPerfilFull(perfil : UsuarioPerfilDTO): Observable<UsuarioPerfilPermissaoDTO[]> {
    this.mensagemService.add('PermissaoService: permissoes de perfil obtidas');
    let returnPermissoes : UsuarioPerfilPermissaoDTO[] = [];
    this.getPermissoesPerfil(perfil)
      .subscribe( permissoes => {

        this.permissaoTipoService
        .getPermissoesTipos()
        .subscribe(tipos => {

          tipos.forEach(tipo => {

            let tipoValores : any[] = [{id:null,descricao:tipo.descricao}];

            if(tipo.tipo == PermissaoTipoEnum.DB){
              tipoValores = this.getPermissaoValorDescricao(tipo.entity);
            }

            tipoValores.forEach( tipoValor => {

              let tipoAdd : UsuarioPerfilPermissaoTipoDTO = this.utilService.newInstance(tipo);
              tipoAdd.descricao = tipoValor.descricao;

              let permissaoAdd : UsuarioPerfilPermissaoDTO = {
                  id: null,
                  usuarioPerfilDTO : perfil,
                  usuarioPerfilPermissaoTipoDTO : tipoAdd,
                  value : tipoValor.id,
                  ativo : false
              }

              let findPermissao = permissoes.find( permissao =>
                permissao.usuarioPerfilPermissaoTipoDTO.id == tipo.id
                &&
                permissao.value == tipoValor.id);

              if(findPermissao){
                permissaoAdd = this.utilService.newInstance(findPermissao);
                permissaoAdd.usuarioPerfilPermissaoTipoDTO.descricao = tipoValor.descricao;
              }

              returnPermissoes.push(permissaoAdd);

            });

          })

        });
      });

      return of(returnPermissoes);
  }

  getPermissaoValorDescricao(entityDTO:UsuarioPerfilPermissaoTipoEntityDTO){

    let contentReturn = [];

    switch(entityDTO.entity){
      case 'Tela':
        this.telaService.getTelas()
          .forEach(tela => {
            contentReturn.push({
             id:tela[entityDTO.propertyId],
             descricao : tela[entityDTO.propertyDescription]
            })
          });
        break;
      case 'Fila':
        this.filaService.getFilas().subscribe( filas => {
          filas.forEach(fila => {
            contentReturn.push({
              id:fila[entityDTO.propertyId],
              descricao : fila[entityDTO.propertyDescription]
            })
          });
        })
        break;
    }

    return contentReturn;
  }

}
