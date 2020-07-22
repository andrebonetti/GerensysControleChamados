import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { MensagemService } from './mensagem.service';
import { UsuarioPerfilDTO } from '../models/usuarioPerfil';
import { usuarioPerfilMOCK } from '../mock/mock-usuario-perfil';

@Injectable({
  providedIn: 'root'
})
export class UsuarioPerfilService {

  constructor(private mensagemService: MensagemService) { }

  getUsuarioPerfis(): Observable<UsuarioPerfilDTO[]> {
    this.mensagemService.add('UsuarioPerfilService: perfis obtidos');
    return of(usuarioPerfilMOCK.lista);
  }

  getUsuarioPerfil(id:number): Observable<UsuarioPerfilDTO>{
    this.mensagemService.add(`UsuarioPerfilService: perfil obtido => id=${id}`);
    return of(usuarioPerfilMOCK.lista.find(perfil => perfil.id === id))
  }
}
