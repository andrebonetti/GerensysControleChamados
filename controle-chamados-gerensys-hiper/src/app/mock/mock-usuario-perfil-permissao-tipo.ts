import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo';
import { usuarioPerfilPermissaoTipoCategorias } from '../storage-json/storage-usuario-perfil-permissao-tipo-categoria';
import { filaMOCK } from '../mock/mock-filas'

const usuarioPerfilPermissaoTipo1 : UsuarioPerfilPermissaoTipoDTO =
{
  id: 1,
  categoria : usuarioPerfilPermissaoTipoCategorias.usuarioPerfilPermissaoTipoCategoriaFila,
  tipo : filaMOCK.lista,
  valor : 1
};
