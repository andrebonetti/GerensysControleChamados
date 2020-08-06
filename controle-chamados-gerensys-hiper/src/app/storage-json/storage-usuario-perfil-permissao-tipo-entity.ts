import { UsuarioPerfilPermissaoTipoEntityDTO } from '../models/UsuarioPerfilPermissaoTipoEntity';

const telas : UsuarioPerfilPermissaoTipoEntityDTO =
{
  id:1,
  entity: "Tela",
  description:"Telas",
  propertyId : "id",
  propertyDescription : "descricao"
};

const filas : UsuarioPerfilPermissaoTipoEntityDTO =
{
  id:2,
  entity: "Fila",
  description:"Filas",
  propertyId : "id",
  propertyDescription : "nome"
};

export const usuariosPerfilPermissaoTipoEntitys = [
  telas,
  filas
]
