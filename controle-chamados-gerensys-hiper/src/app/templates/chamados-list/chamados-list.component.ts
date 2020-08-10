import { Component, OnInit, Input } from '@angular/core';
import { ChamadoDTO } from 'src/app/models/chamado';

@Component({
  selector: 'app-chamados-list',
  templateUrl: './chamados-list.component.html',
  styleUrls: ['./chamados-list.component.less']
})
export class ChamadosListComponent implements OnInit {

  constructor() { }

  @Input("listaChamados") chamados:ChamadoDTO[];

  ngOnInit(): void {
  }

}
