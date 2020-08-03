import { Component, OnInit } from '@angular/core';
import { UsuarioPerfilService } from '../../service/usuario-perfil.service'
import { UsuarioPerfilDTO } from 'src/app/models/usuarioPerfil';
import { MensagemService } from 'src/app/service/mensagem.service';
import { PermissaoService } from 'src/app/service/permissao.service';
import { FilaService } from 'src/app/service/fila.service';
import { ChaveValor } from 'src/app/models/chaveValor';
import { usuariosPerfilPermissaoTipoCategoria } from '../../storage-json/storage-usuario-perfil-permissao-tipo-categoria';
import { UsuarioPerfilPermissaoDTO } from 'src/app/models/usuarioPerfilPermissao';

@Component({
  selector: 'app-usuario-perfis',
  templateUrl: './usuario-perfis.component.html',
  styleUrls: ['./usuario-perfis.component.less']
})
export class UsuarioPerfisComponent implements OnInit {

  constructor(
    private mensagemService: MensagemService,
    private filaService: FilaService,
    private permissaoService : PermissaoService,
    private usuarioPerfilService: UsuarioPerfilService) { }

  perfis : UsuarioPerfilDTO[]
  categorias : ChaveValor[] = usuariosPerfilPermissaoTipoCategoria;
  permissoes : UsuarioPerfilPermissaoDTO[];
  permissoesTipo : UsuarioPerfilPermissaoDTO[];

  perfilActive : UsuarioPerfilDTO;
  categoriaActive : ChaveValor = this.categorias[0];
  permissoesActive : UsuarioPerfilPermissaoDTO[];

  ngOnInit(): void {
    this.getUsuarioPerfis();
    this.setPermissoesPerfil();
    this.setPermissoesPerfilCategoria();
  }

  getUsuarioPerfis(): void {
    this.usuarioPerfilService.getUsuarioPerfis().subscribe(perfis => {
      this.perfis = perfis;
      this.perfilActive = perfis.find( p => p.id = 1);
    });
  }

  setPermissoesPerfil():void {
    this.permissaoService.setPermissoesPerfilFull(this.perfilActive).subscribe(permissoes => this.permissoes = permissoes );
  }

  filtarPerfil(id:number):void{
    this.mensagemService.add(`UsuarioPerfisComponent: filtrar perfil => ${id}`);
    this.perfilActive = this.perfis.find( perfil => perfil.id == id );
    this.setPermissoesPerfil();
    this.setPermissoesPerfilCategoria();
  }

  filtarCategoria(chave:string):void{
    this.mensagemService.add(`UsuarioPerfisComponent: filtrar categoria => ${chave}`);
    this.categoriaActive = this.categorias.find( categoria => categoria.chave == chave )
    this.setPermissoesPerfilCategoria();
  }

  setPermissoesPerfilCategoria(){
    this.permissoesActive = this.permissoes.filter( permissao =>
      permissao.usuarioPerfilPermissaoTipoDTO.categoria.chave == this.categoriaActive.chave );
  }

}
