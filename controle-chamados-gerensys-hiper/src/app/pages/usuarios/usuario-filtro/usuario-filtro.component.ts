import { Component, OnInit } from '@angular/core';
import { MensagemService } from 'src/app/service/mensagem.service';
import { InputText } from 'src/app/models/form/input-text';
import { InputSelect } from 'src/app/models/form/input-select';
import { UsuarioPerfilService } from "src/app/service/usuario-perfil.service";
import { ChaveValor } from 'src/app/models/chaveValor';

@Component({
  selector: 'app-usuario-filtro',
  templateUrl: './usuario-filtro.component.html',
  styleUrls: ['./usuario-filtro.component.less']
})
export class UsuarioFiltroComponent implements OnInit {

  inputBusca : InputText = {
    id: "busca",
    label: "Busca",
    name: "busca",
    placeholder: "",
    prepend: true
  };

  inputPerfis : InputSelect = {
    id: "perfil",
    label: "Perfil",
    name: "perfil",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "id",
    optionText: "nome"
  }

  inputAtivo : InputSelect = {
    id: "ativo",
    label: "Ativo",
    name: "ativo",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "chave",
    optionText: "valor"
  }

  constructor(
    private mensagemService: MensagemService,
    private usuarioPerfilService : UsuarioPerfilService){

  }

  ngOnInit(): void {
    this.getPerfis();
    this.getAtivoOpt();
  }

  buscar(){
    this.mensagemService.add("buscar");
  }

  getPerfis() : void{
    this.usuarioPerfilService.getUsuarioPerfis().subscribe( usuarios => this.inputPerfis.content = usuarios );
  }

  getAtivoOpt() : void{
    let ativoOpt : ChaveValor[] = [
      {
        chave : "0",
        valor : "Não"
      },
      {
        chave : "1",
        valor : "Sim"
      }
    ]

    this.inputAtivo.content = ativoOpt;
  }

}
