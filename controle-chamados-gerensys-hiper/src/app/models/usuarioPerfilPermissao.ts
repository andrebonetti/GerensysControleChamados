import { UsuarioPerfilDTO } from '../models/usuarioPerfil';
import { UsuarioPerfilPermissaoTipoDTO } from '../models/usuarioPerfilPermissaoTipo';

export interface UsuarioPerfilPermissaoDTO {
    id:number,
    usuarioPerfilDTO: UsuarioPerfilDTO,
    usuarioPerfilPermissaoTipoDTO :  UsuarioPerfilPermissaoTipoDTO,
    value : any
    ativo : Boolean
}
