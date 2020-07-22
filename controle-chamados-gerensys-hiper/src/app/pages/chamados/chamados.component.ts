import { Component, OnInit } from '@angular/core';
import { FilaDTO } from '../../models/fila'
import { FilaService } from '../../service/fila.service';
import { MensagemService } from 'src/app/service/mensagem.service';

@Component({
  selector: 'app-chamados',
  templateUrl: './chamados.component.html',
  styleUrls: ['./chamados.component.less']
})
export class ChamadosComponent implements OnInit {

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
