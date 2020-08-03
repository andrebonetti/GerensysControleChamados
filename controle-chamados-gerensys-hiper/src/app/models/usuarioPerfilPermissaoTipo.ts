import {ChaveValor} from '../models/chaveValor';
import {UsuarioPerfilPermissaoTipoEntityDTO} from '../models/usuarioPerfilPermissaoTipoEntity';

export interface UsuarioPerfilPermissaoTipoDTO {
    id:number,
    categoria : ChaveValor,
    tipo: string,
    entity: UsuarioPerfilPermissaoTipoEntityDTO
    descricao: string,
}
