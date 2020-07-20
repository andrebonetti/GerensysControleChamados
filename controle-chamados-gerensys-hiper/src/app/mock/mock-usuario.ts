import { UsuarioDTO } from '../models/usuario';
import { usuarioPerfilMOCK } from '../mock/mock-usuario-perfil';
import { empresaMOCK } from './mock-empresa'

const UsuarioCriacao1MOCK : UsuarioDTO =
{
  id:1,
  nome: "Usuario 1",
  email: "usuario1@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case1,
  empresaDTO : empresaMOCK.case1,
};

const UsuarioCriacao2MOCK : UsuarioDTO =
{
  id:2,
  nome: "Usuario 2",
  email: "usuario2@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case1,
  empresaDTO : empresaMOCK.case2,
};


const UsuarioCriacao3MOCK : UsuarioDTO =
{
  id:3,
  nome: "Usuario 3",
  email: "usuario3@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case3,
  empresaDTO : empresaMOCK.case1,
};

const UsuarioResponsavel1MOCK : UsuarioDTO =
{
  id:4,
  nome: "Usuario 1",
  email: "usuario1@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case2,
  empresaDTO : [empresaMOCK.gerensys],
};

const UsuarioResponsavel2MOCK : UsuarioDTO =
{
  id:5,
  nome: "Usuario 2",
  email: "usuario2@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case2,
  empresaDTO : [empresaMOCK.gerensys],
};

const UsuarioResponsavel3MOCK : UsuarioDTO =
{
  id:6,
  nome: "Usuario 3",
  email: "usuario3@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case3,
  empresaDTO : [empresaMOCK.gerensys,empresaMOCK.case1],
};

const UsuariosResponsaveis1MOCK : UsuarioDTO[] =
[UsuarioResponsavel1MOCK];

const UsuariosResponsaveis2MOCK : UsuarioDTO[] =
[UsuarioResponsavel2MOCK];

const UsuariosResponsaveis3MOCK : UsuarioDTO[] =
[UsuarioResponsavel3MOCK];

const UsuariosResponsaveisMultiMOCK : UsuarioDTO[] =
[UsuarioResponsavel1MOCK,UsuarioResponsavel2MOCK];

const usuarios : UsuarioDTO[] =
[UsuarioResponsavel1MOCK,UsuarioResponsavel2MOCK,UsuarioCriacao3MOCK];

export const usuarioMOCK = {
  usuarios : usuarios,
  usuarioCriacao1MOCK : UsuarioCriacao1MOCK,
  usuarioCriacao2MOCK : UsuarioCriacao2MOCK,
  usuarioCriacao3MOCK : UsuarioCriacao3MOCK,
  usuariosResponsaveis1MOCK : UsuariosResponsaveis1MOCK,
  usuariosResponsaveis2MOCK : UsuariosResponsaveis2MOCK,
  usuariosResponsaveis3MOCK : UsuariosResponsaveis3MOCK,
  usuariosResponsaveisMultiMOCK : UsuariosResponsaveisMultiMOCK,
};
