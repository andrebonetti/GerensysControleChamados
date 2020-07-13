import { Component, OnInit } from '@angular/core';
import { ChamadoDTO } from '../chamado'
import { ChamadosMOCK } from '../mock-chamados'
import { ChamadoService } from '../chamado.service';
import { MensagemService } from '../mensagem.service';

@Component({
  selector: 'app-chamados',
  templateUrl: './chamados.component.html',
  styleUrls: ['./chamados.component.less']
})
export class ChamadosComponent implements OnInit {

  chamados : ChamadoDTO[];

  constructor(private chamadoService: ChamadoService) {}

  ngOnInit(): void {
    this.getChamados();
  }

  getChamados(): void {
    this.chamadoService.getChamados().subscribe(chamados => this.chamados = chamados);
  }

}
