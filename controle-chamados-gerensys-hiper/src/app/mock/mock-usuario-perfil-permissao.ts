import { UsuarioPerfilPermissaoDTO } from '../models/usuarioPerfilPermissao';
import { usuarioPerfilMOCK } from '../mock/mock-usuario-perfil';

const usuarioPerfilPermissao : UsuarioPerfilPermissaoDTO =
{
  id: 1,
  usuarioPerfilDTO : usuarioPerfilMOCK.case1,
  usuarioPerfilPermissaoTipoDTO : null,
  ativo : true
};
