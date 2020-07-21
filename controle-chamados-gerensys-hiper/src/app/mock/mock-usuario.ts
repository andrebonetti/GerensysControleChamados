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
  empresaDTO : [empresaMOCK.case1],
  dataCriacao : new Date("01/01/2000"),
  dataUltimaModificacao : new Date("01/02/2000"),
  ativo:true,
  senha:"a3dcb4d229de6fde0db5686dee47145d"
};

const UsuarioCriacao2MOCK : UsuarioDTO =
{
  id:2,
  nome: "Usuario 2",
  email: "usuario2@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case1,
  empresaDTO : [empresaMOCK.case2],
  dataCriacao : new Date("01/01/2001"),
  dataUltimaModificacao : new Date("01/02/2001"),
  ativo:true,
  senha : "9c0e98885486450aeece88107a8f2e67"
};


const UsuarioCriacao3MOCK : UsuarioDTO =
{
  id:3,
  nome: "Usuario 3",
  email: "usuario3@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case3,
  empresaDTO : [empresaMOCK.case1],
  dataCriacao : new Date("01/01/2002"),
  dataUltimaModificacao : new Date("01/02/2002"),
  ativo:true,
  senha :  "eb8f69f64ddbe8f26fa9db44b28ce3e3"
};

const UsuarioResponsavel1MOCK : UsuarioDTO =
{
  id:4,
  nome: "Usuario 1",
  email: "usuario1@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case2,
  empresaDTO : [empresaMOCK.gerensys],
  dataCriacao : new Date("01/01/2003"),
  dataUltimaModificacao : new Date("01/02/2003"),
  ativo:true,
  senha: "34c8cef6b2237bc9b90ff16e1e029c52"
};

const UsuarioResponsavel2MOCK : UsuarioDTO =
{
  id:5,
  nome: "Usuario 2",
  email: "usuario2@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case2,
  empresaDTO : [empresaMOCK.gerensys],
  dataCriacao : new Date("01/01/2004"),
  dataUltimaModificacao : new Date("01/02/2004"),
  ativo:false,
  senha: "49bba4800a312eb02fdc64f98607e3e8"
};

const UsuarioResponsavel3MOCK : UsuarioDTO =
{
  id:6,
  nome: "Usuario 3",
  email: "usuario3@gerensys.com",
  imagem: "src",
  perfilDTO : usuarioPerfilMOCK.case3,
  empresaDTO : [empresaMOCK.gerensys,empresaMOCK.case1],
  dataCriacao : new Date("01/01/2005"),
  dataUltimaModificacao : new Date("01/02/2005"),
  ativo:true,
  senha : "70577075671acbbb2b3650f256c85eb6"
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
