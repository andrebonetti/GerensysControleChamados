import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { FilaDTO } from '../models/fila';
import { filaMOCK } from '../mock/mock-filas';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilaService {

  constructor(private mensagemService: MensagemService) { }

  getFilas(): Observable<FilaDTO[]> {
    this.mensagemService.add('FilaService: filas obtidas');
    return of(filaMOCK.lista);
  }

}
