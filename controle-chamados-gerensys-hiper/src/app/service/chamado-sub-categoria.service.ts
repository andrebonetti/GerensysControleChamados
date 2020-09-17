import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { Observable, of } from 'rxjs';
import { ChamadoCategoriaDTO } from '../models/chamadoCategoria';
import { chamadoSubCategoriaMOCK } from '../mock/mock-chamado-sub-categoria';
import { ChamadoSubCategoriaDTO } from '../models/chamadoSubCategoria';

@Injectable({
  providedIn: 'root'
})
export class ChamadoSubCategoriaService {

  constructor(private mensagemService: MensagemService) { }

  getChamadoSubCategoria(): Observable<ChamadoSubCategoriaDTO[]> {
    this.mensagemService.add('ChamadoSubCategoriaService: chamado sub categorias obtidos');
    return of(chamadoSubCategoriaMOCK.lista);
  }

}
