import { Component, OnInit, Input } from '@angular/core';
import { ChamadoDTO } from '../chamado'

@Component({
  selector: 'app-chamado-detalhe',
  templateUrl: './chamado-detalhe.component.html',
  styleUrls: ['./chamado-detalhe.component.less']
})
export class ChamadoDetalheComponent implements OnInit {

  constructor() { }

  @Input() chamado: ChamadoDTO;

  ngOnInit(): void {
  }

}
