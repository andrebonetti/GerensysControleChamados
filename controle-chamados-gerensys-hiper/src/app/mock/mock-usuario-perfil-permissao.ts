import { UsuarioPerfilPermissaoDTO } from '../models/usuarioPerfilPermissao';
import { usuarioPerfilMOCK } from '../mock/mock-usuario-perfil';
import { tiposMOCK } from '../mock/mock-usuario-perfil-permissao-tipo'

export const usuarioPerfilPermissaoMOCK : UsuarioPerfilPermissaoDTO[] = [
  {
    id: 1,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 1,
    ativo : true
  },
  {
    id: 2,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 2,
    ativo : true
  },
  {
    id: 3,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 3,
    ativo : true
  },
  {
    id: 4,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 1,
    ativo : true
  },
  {
    id: 5,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 2,
    ativo : true
  },
  {
    id: 6,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 3,
    ativo : true
  },
  {
    id: 7,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 3),
    value : null,
    ativo : true
  },
  {
    id: 8,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 4),
    value : null,
    ativo : true
  },
  {
    id: 9,
    usuarioPerfilDTO : usuarioPerfilMOCK.case1,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 5),
    value : null,
    ativo : true
  },
  {
    id: 10,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 1,
    ativo : true
  },
  {
    id: 11,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 2,
    ativo : true
  },
  {
    id: 12,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 1),
    value : 3,
    ativo : false
  },
  {
    id: 13,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 1,
    ativo : true
  },
  {
    id: 14,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 2,
    ativo : true
  },
  {
    id: 15,
    usuarioPerfilDTO : usuarioPerfilMOCK.case2,
    usuarioPerfilPermissaoTipoDTO : tiposMOCK.find( t => t.id == 2),
    value : 3,
    ativo : false
  }
]
