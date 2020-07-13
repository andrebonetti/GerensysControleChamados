import { Injectable } from '@angular/core';
import { ChamadoDTO } from './chamado';
import { ChamadosMOCK } from './mock-chamados';
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

}
