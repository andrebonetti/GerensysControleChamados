import { Injectable } from '@angular/core';
import { ChamadoDTO } from '../models/chamado';
import { ChamadosMOCK } from '../mock/mock-chamados';
import { Observable, of } from 'rxjs';
import { MensagemService } from './mensagem.service';

@Injectable({
  providedIn: 'root'
})
export class ChamadoService {

  constructor(private mensagemService: MensagemService) { }

  getChamados(): Observable<ChamadoDTO[]> {
    this.mensagemService.add('ChamadoService: chamados obtidos');
    return of(ChamadosMOCK);
  }

  getChamado(id: number): Observable<ChamadoDTO> {
    // TODO: send the message _after_ fetching the hero
    this.mensagemService.add(`ChamadoService: chamado obtido => id=${id}`);
    return of(ChamadosMOCK.find(chamado => chamado.id === id));
  }

}
