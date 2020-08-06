import { Injectable } from '@angular/core';
import { telas } from '../storage-json/storage-tela';
import { MensagemService } from './mensagem.service';


@Injectable({
  providedIn: 'root'
})
export class TelaService {

  constructor(private mensagemService: MensagemService) { }

  getTelas(){
    return telas;
  }

}
