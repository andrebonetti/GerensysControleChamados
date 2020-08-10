import { Component, OnInit } from '@angular/core';
import { ChamadoPrioridadeService } from "../../../service/chamado-prioridade.service";
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

  constructor(
    private chamadoPrioridadeService: ChamadoPrioridadeService,
    private chamadoFilasService : FilaService ) {

    }

  ngOnInit(): void {
    this.getChamadoPrioridades();
    this.getChamadoFilas();
  }

  getChamadoPrioridades() : void{
    this.chamadoPrioridadeService.getChamadoPrioridades().subscribe( prioridades => this.chamadoPrioridades = prioridades );
  }

  getChamadoFilas() : void{
    this.chamadoFilasService.getFilas().subscribe( filas => this.chamadoFilas = filas );
  }

}
