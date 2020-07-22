import { Component, OnInit } from '@angular/core';
import { UsuarioPerfilService } from '../../service/usuario-perfil.service'
import { UsuarioPerfilDTO } from 'src/app/models/usuarioPerfil';
import { MensagemService } from 'src/app/service/mensagem.service';
import { FilaService } from 'src/app/service/fila.service';
import { FilaDTO } from 'src/app/models/fila';
import { ChaveValor } from 'src/app/models/chaveValor';

@Component({
  selector: 'app-usuario-perfis',
  templateUrl: './usuario-perfis.component.html',
  styleUrls: ['./usuario-perfis.component.less']
})
export class UsuarioPerfisComponent implements OnInit {

  constructor(
    private mensagemService: MensagemService,
    private filaService: FilaService,
    private usuarioPerfilService: UsuarioPerfilService) { }

  perfis : UsuarioPerfilDTO[]

  tipos : ChaveValor[];

  filas : FilaDTO[];

  ngOnInit(): void {
    this.getUsuarioPerfis();
    this.getTipos();
    this.getFilas();
  }

  getUsuarioPerfis(): void {
    this.usuarioPerfilService.getUsuarioPerfis().subscribe(perfis => this.perfis = perfis);
  }

  getFilas():void {
    this.filaService.getFilas().subscribe(filas => this.filas = filas );
  }

  getTipos():void {
    this.tipos = [
      {
        chave:"fila",
        valor:"Filas"
      },
      {
        chave:"configuracoes",
        valor:"Configurações"
      }
    ]
  }

  filtarPerfil(id:number):void{
    this.mensagemService.add(`UsuarioPerfisComponent: filtrar perfil => ${id}`);
  }

  filtarTipo(id:number):void{
    this.mensagemService.add(`UsuarioPerfisComponent: filtrar tipo => ${id}`);
  }

}
