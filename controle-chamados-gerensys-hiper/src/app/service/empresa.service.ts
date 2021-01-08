import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { EmpresaDTO,EmpresaCompleteGridDTO } from "../models/empresa";
import { empresaMOCK } from "../mock/mock-empresa";
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmpresaService {

  private heroesUrl = `http://localhost:8085/empresas/`;

  constructor(private mensagemService: MensagemService
    ,private http: HttpClient,) { }

  getEmpresas() : Observable<EmpresaCompleteGridDTO[]> {
    return this.http.get<EmpresaCompleteGridDTO[]>(`${ this.heroesUrl }`);
  }

}
