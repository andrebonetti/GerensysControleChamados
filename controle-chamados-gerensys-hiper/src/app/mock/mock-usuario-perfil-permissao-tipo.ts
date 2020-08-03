import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo';
import { usuariosPerfilPermissaoTipoCategoria } from '../storage-json/storage-usuario-perfil-permissao-tipo-categoria';
import {PermissaoTipoEnum} from '../models/enums/permissao_tipo'

const tela : UsuarioPerfilPermissaoTipoDTO =
{
  id: 1,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "tela"),
  tipo : PermissaoTipoEnum.DB,
  chave : "Tela",
  valor : "id"
};

const fila : UsuarioPerfilPermissaoTipoDTO =
{
  id: 2,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "fila"),
  tipo : PermissaoTipoEnum.DB,
  chave : "Fila",
  valor : "id"
};

const config_fila : UsuarioPerfilPermissaoTipoDTO =
{
  id: 3,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  chave : "filaCRUD",
  valor : "Criar/Editar Fila"
};

const config_usuario : UsuarioPerfilPermissaoTipoDTO =
{
  id: 4,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  chave : "usuarioCRUD",
  valor : "Criar/Editar Usuario"
};

const config_perfil : UsuarioPerfilPermissaoTipoDTO =
{
  id: 5,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  chave : "perfilCRUD",
  valor : "Criar/Editar Perfil"
};

export const tiposMOCK : UsuarioPerfilPermissaoTipoDTO[] = [
  tela,
  fila,
  config_fila,
  config_usuario,
  config_perfil
]
