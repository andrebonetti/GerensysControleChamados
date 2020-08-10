import { Component, OnInit } from '@angular/core';
import { FilaService } from '../../service/fila.service';
import { MensagemService } from 'src/app/service/mensagem.service';
import { FilaDTO } from '../../models/fila'

@Component({
  selector: 'app-fila-grid',
  templateUrl: './fila-grid.component.html',
  styleUrls: ['./fila-grid.component.less']
})
export class FilaGridComponent implements OnInit {

  filasDTO : FilaDTO[];

  constructor(
    private mensagemService: MensagemService,
    private filaService: FilaService) {}

  ngOnInit(): void {
    this.getFilas();
  }

  getFilas(): void {
    this.filaService.getFilasFull().subscribe(filas => this.filasDTO = filas);
  }

  collapse(){
    this.mensagemService.add("collapse");
  }

}
