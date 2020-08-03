import { UsuarioPerfilDTO } from '../models/usuarioPerfil';

const usuarioPerfil1 : UsuarioPerfilDTO =
{
  id: 1,
  nome: "Administrador"
};

const usuarioPerfil2 : UsuarioPerfilDTO =
{
  id: 2,
  nome: "Operador 1"
};

const usuarioPerfil3 : UsuarioPerfilDTO =
{
  id: 3,
  nome: "Operador 2"
};

export const usuarioPerfilMOCK = {
  lista : [usuarioPerfil1,usuarioPerfil2,usuarioPerfil3],
  case1 : usuarioPerfil1,
  case2 : usuarioPerfil2,
  case3 : usuarioPerfil3
}
