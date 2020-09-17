import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { Observable } from 'rxjs/internal/Observable';
import { ChamadoCategoriaDTO } from '../models/chamadoCategoria';
import { chamadoCategoriaMOCK } from '../mock/mock-chamado-categoria';
import { of } from 'rxjs/internal/observable/of';

@Injectable({
  providedIn: 'root'
})
export class ChamadoCategoriaService {

  constructor(private mensagemService: MensagemService) { }

  getChamadoCategoria(): Observable<ChamadoCategoriaDTO[]> {
    this.mensagemService.add('ChamadoCategoriaService: chamado categorias obtidos');
    return of(chamadoCategoriaMOCK.lista);
  }
}
