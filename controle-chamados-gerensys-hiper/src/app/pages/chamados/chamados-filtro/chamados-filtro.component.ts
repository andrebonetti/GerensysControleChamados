import { Component, OnInit } from '@angular/core';
import { ChamadoPrioridadeService } from "../../../service/chamado-prioridade.service";
import { UsuarioDTO } from "../../../models/usuario";
import { UsuarioService } from "../../../service/usuario.service";
import { EmpresaService  } from "../../../service/empresa.service";
import { EmpresaDTO } from "../../../models/empresa";
import { FilaService } from "../../../service/fila.service";
import { FilaDTO } from "../../../models/fila";
import { ChaveValor } from "../../../models/chaveValor";

@Component({
  selector: 'app-chamados-filtro',
  templateUrl: './chamados-filtro.component.html',
  styleUrls: ['./chamados-filtro.component.less']
})
export class ChamadosFiltroComponent implements OnInit {

  chamadoPrioridades : ChaveValor[];
  chamadoFilas : FilaDTO[];
  usuarios : UsuarioDTO[];
  empresas : EmpresaDTO[];

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
    this.chamadoPrioridadeService.getChamadoPrioridades().subscribe( prioridades => this.chamadoPrioridades = prioridades );
  }

  getChamadoFilas() : void{
    this.chamadoFilasService.getFilas().subscribe( filas => this.chamadoFilas = filas );
  }

  getUsuarios() : void{
    this.usuarioService.getUsuarios().subscribe( usuarios => this.usuarios = usuarios );
  }

  getEmpresas() : void{
    this.empresaService.getEmpresas().subscribe( empresas => this.empresas = empresas );
  }

  mudarParametroData(tipoData:ChaveValor) : void{
    this.parametroData = tipoData;
  }
}
