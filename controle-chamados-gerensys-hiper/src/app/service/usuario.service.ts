import { Injectable } from '@angular/core';
import { MensagemService } from './mensagem.service';
import { UsuarioDTO } from '../models/usuario';
import { usuarioMOCK } from '../mock/mock-usuario';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private mensagemService: MensagemService) { }

  getUsuarios(): Observable<UsuarioDTO[]> {
    this.mensagemService.add('UsuarioService: usuarios obtidos');
    return of(usuarioMOCK.usuarios);
  }

}
