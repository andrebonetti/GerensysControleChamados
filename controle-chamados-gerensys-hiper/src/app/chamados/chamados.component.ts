import { Component, OnInit } from '@angular/core';
import { FilaDTO } from '../models/fila'
import { FilaService } from '../service/fila.service';
import { faAngleRight } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-chamados',
  templateUrl: './chamados.component.html',
  styleUrls: ['./chamados.component.less']
})
export class ChamadosComponent implements OnInit {

  faAngleRight = faAngleRight;
  filasDTO : FilaDTO[];

  constructor(private filaService: FilaService) {}

  ngOnInit(): void {
    this.getFilas();
  }

  getFilas(): void {
    this.filaService.getFilas().subscribe(filas => this.filasDTO = filas);
  }

  collapse(){
    console.log("collapse");
  }

}
