import { Injectable } from '@angular/core';
import { tiposMOCK } from '../mock/mock-usuario-perfil-permissao-tipo'
import { MensagemService } from './mensagem.service';
import { Observable, of } from 'rxjs';
import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo'

@Injectable({
  providedIn: 'root'
})
export class PermissaoTipoService {

  constructor(private mensagemService: MensagemService) { }

  getPermissoesTipos(): Observable<UsuarioPerfilPermissaoTipoDTO[]> {
    this.mensagemService.add('PermissaoTipoService: permissoes-tipo obtidas');
    return of(tiposMOCK);
  }

}
