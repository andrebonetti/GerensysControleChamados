import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo';
import { usuariosPerfilPermissaoTipoCategoria } from '../storage-json/storage-usuario-perfil-permissao-tipo-categoria';
import { PermissaoTipoEnum } from '../models/enums/permissao_tipo'
import { usuariosPerfilPermissaoTipoEntitys } from "../storage-json/storage-usuario-perfil-permissao-tipo-entity";

const tela : UsuarioPerfilPermissaoTipoDTO =
{
  id: 1,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "tela"),
  tipo : PermissaoTipoEnum.DB,
  entity : usuariosPerfilPermissaoTipoEntitys.find( entity => entity.id == 1),
  descricao : null
};

const fila : UsuarioPerfilPermissaoTipoDTO =
{
  id: 2,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "fila"),
  tipo : PermissaoTipoEnum.DB,
  entity : usuariosPerfilPermissaoTipoEntitys.find( entity => entity.id == 2 ),
  descricao : null
};

const config_fila : UsuarioPerfilPermissaoTipoDTO =
{
  id: 3,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  entity : null,
  descricao : "Criar/Editar Fila"
};

const config_usuario : UsuarioPerfilPermissaoTipoDTO =
{
  id: 4,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  entity : null,
  descricao : "Criar/Editar Usuario"
};

const config_perfil : UsuarioPerfilPermissaoTipoDTO =
{
  id: 5,
  categoria : usuariosPerfilPermissaoTipoCategoria.find( u => u.chave == "configuracao"),
  tipo : PermissaoTipoEnum.MANUAL,
  entity : null,
  descricao : "Criar/Editar Perfil"
};

export const tiposMOCK : UsuarioPerfilPermissaoTipoDTO[] = [
  tela,
  fila,
  config_fila,
  config_usuario,
  config_perfil
]
