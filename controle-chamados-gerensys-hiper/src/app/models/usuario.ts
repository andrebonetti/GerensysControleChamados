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
}
