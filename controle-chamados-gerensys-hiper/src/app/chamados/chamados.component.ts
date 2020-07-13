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

  chamadoSelecionado: ChamadoDTO;
  chamados : ChamadoDTO[];

  constructor(private chamadoService: ChamadoService,
    private mensagemService: MensagemService) {}

  ngOnInit(): void {
    this.getChamados();
  }

  getChamados(): void {
    this.chamadoService.getChamados().subscribe(chamados => this.chamados = chamados);
  }

  onSelect(chamado: ChamadoDTO): void {
    this.chamadoSelecionado = chamado;
    this.mensagemService.add(`ChamadosComponent: chmado selecionado => id:${this.chamadoSelecionado.id}`);
  }

}
