import { Component, OnInit } from '@angular/core';
import { MensagemService } from '../service/mensagem.service';

@Component({
  selector: 'app-mensagens',
  templateUrl: './mensagens.component.html',
  styleUrls: ['./mensagens.component.less']
})
export class MensagensComponent implements OnInit {

  constructor(public mensagemService: MensagemService) { }

  ngOnInit(): void {
  }

}
