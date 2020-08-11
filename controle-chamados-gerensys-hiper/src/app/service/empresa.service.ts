import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { EmpresaDTO } from "../models/empresa";
import { empresaMOCK } from "../mock/mock-empresa";
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpresaService {

  constructor(private mensagemService: MensagemService) { }

  getEmpresas(): Observable<EmpresaDTO[]> {
    this.mensagemService.add('EmpresaService: empresas obtidas');
    return of(empresaMOCK.empresas);
  }
}
