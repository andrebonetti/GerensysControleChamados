import { Injectable } from '@angular/core';
import { ChamadoDTO } from '../models/chamado';
import { chamadosMOCK } from '../mock/mock-chamados';
import { Observable, of } from 'rxjs';
import { MensagemService } from './mensagem.service';

@Injectable({
  providedIn: 'root'
})
export class ChamadoService {

  constructor(private mensagemService: MensagemService) { }

  getChamados(): Observable<ChamadoDTO[]> {
    this.mensagemService.add('ChamadoService: chamados obtidos');
    return of(chamadosMOCK);
  }

  getChamado(id: number): Observable<ChamadoDTO> {
    this.mensagemService.add(`ChamadoService: chamado obtido => id=${id}`);
    return of(chamadosMOCK.find(chamado => chamado.id === id));
  }

}
