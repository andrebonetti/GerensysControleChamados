import { Component, OnInit } from '@angular/core';
import { ChamadoPrioridadeService } from "../../../service/chamado-prioridade.service";
import { UsuarioDTO } from "../../../models/usuario";
import { UsuarioService } from "../../../service/usuario.service";
import { EmpresaService  } from "../../../service/empresa.service";
import { EmpresaDTO } from "../../../models/empresa";
import { FilaService } from "../../../service/fila.service";
import { FilaDTO } from "../../../models/fila";
import { ChaveValor } from "../../../models/chaveValor";
import { InputText } from 'src/app/models/form/input-text';
import { InputSelect } from 'src/app/models/form/input-select';

@Component({
  selector: 'app-chamados-filtro',
  templateUrl: './chamados-filtro.component.html',
  styleUrls: ['./chamados-filtro.component.less']
})
export class ChamadosFiltroComponent implements OnInit {

  inputBusca : InputText = {
    id: "busca",
    label: "Busca",
    name: "busca",
    placeholder: "",
    prepend: true
  };

  inputPrioridade : InputSelect = {
    id: "prioridade",
    label: "Prioridade",
    name: "prioridade",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "chave",
    optionText: "valor"
  }

  inputFila : InputSelect = {
    id: "fila",
    label: "Fila",
    name: "fila",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "id",
    optionText: "nome"
  }

  inputUsuarios : InputSelect = {
    id: "usuario",
    label: "Usuario",
    name: "usuario",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "id",
    optionText: "nome"
  }

  inputEmpresas : InputSelect = {
    id: "empresa",
    label: "Empresa",
    name: "empresa",
    placeholder: "Escolha...",
    prepend: true,
    content : [],
    optionId : "id",
    optionText: "nome"
  }

  parametroData :  ChaveValor = {
    chave : "dataCadastro",
    valor : "Data Cadastro"
  }

  tiposDatas : ChaveValor[] = [
    {
      chave : "dataCadastro",
      valor : "Data Cadastro"
    },
    {
      chave : "dataModificacao",
      valor : "Data Modificação"
    }
  ]

  constructor(
    private chamadoPrioridadeService: ChamadoPrioridadeService,
    private chamadoFilasService : FilaService,
    private usuarioService : UsuarioService,
    private empresaService : EmpresaService ) {
    }

  ngOnInit(): void {
    this.getChamadoPrioridades();
    this.getChamadoFilas();
    this.getUsuarios();
    this.getEmpresas();
  }

  getChamadoPrioridades() : void{
    this.chamadoPrioridadeService.getChamadoPrioridades().subscribe( prioridades => this.inputPrioridade.content = prioridades );
  }

  getChamadoFilas() : void{
    this.chamadoFilasService.getFilas().subscribe( filas => this.inputFila.content = filas );
  }

  getUsuarios() : void{
    this.usuarioService.getUsuarios().subscribe( usuarios => this.inputUsuarios.content = usuarios );
  }

  getEmpresas() : void{
    this.empresaService.getEmpresas().subscribe( empresas => this.inputEmpresas.content = empresas );
  }

}
