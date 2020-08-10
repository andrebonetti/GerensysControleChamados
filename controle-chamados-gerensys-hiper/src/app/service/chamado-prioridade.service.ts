import { Injectable } from '@angular/core';
import { ChaveValor } from "../models/chaveValor";
import { chamadoPrioridade } from "../storage-json/storage-chamado-prioridade";
import { MensagemService } from './mensagem.service';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ChamadoPrioridadeService {

  constructor(private mensagemService: MensagemService) { }

  getChamadoPrioridades(): Observable<ChaveValor[]> {
    this.mensagemService.add('ChamadoPrioridadeService: chamado prioridades obtidos');
    return of(chamadoPrioridade);
  }
}
