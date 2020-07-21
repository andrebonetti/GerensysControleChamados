import { UsuarioPerfilDTO } from './usuarioPerfil';
import { EmpresaDTO } from './empresa';

export interface UsuarioDTO {
    id:number,
    nome: string,
    email:string,
    imagem:string,
    perfilDTO : UsuarioPerfilDTO,
    empresaDTO : EmpresaDTO[],
    dataCriacao : Date,
    dataUltimaModificacao : Date,
    ativo : boolean,
    senha : string
}

export const usuarioDTOClear : UsuarioDTO = {
  id : null,
  ativo: null,
  dataCriacao: null,
  dataUltimaModificacao: null,
  email: null,
  empresaDTO: null,
  nome: null,
  perfilDTO: null,
  imagem: null,
  senha : null,
}
