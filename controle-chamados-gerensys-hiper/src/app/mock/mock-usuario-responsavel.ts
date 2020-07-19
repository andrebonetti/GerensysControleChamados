import { UsuarioDTO } from '../models/usuario';

const UsuarioResponsavel1MOCK : UsuarioDTO =
{
  id:1,
  nome: "Usuario 1",
  email: "usuario1@gerensys.com",
  imagem: "src"
};

const UsuarioResponsavel2MOCK : UsuarioDTO =
{
  id:2,
  nome: "Usuario 2",
  email: "usuario2@gerensys.com",
  imagem: "src"
};


const UsuarioResponsavel3MOCK : UsuarioDTO =
{
  id:3,
  nome: "Usuario 3",
  email: "usuario3@gerensys.com",
  imagem: "src"
};

export const UsuariosResponsaveis1MOCK : UsuarioDTO[] =
[UsuarioResponsavel1MOCK];

export const UsuariosResponsaveis2MOCK : UsuarioDTO[] =
[UsuarioResponsavel2MOCK];

export const UsuariosResponsaveis3MOCK : UsuarioDTO[] =
[UsuarioResponsavel3MOCK];

export const UsuariosResponsaveisMultiMOCK : UsuarioDTO[] =
[UsuarioResponsavel1MOCK,UsuarioResponsavel2MOCK];
