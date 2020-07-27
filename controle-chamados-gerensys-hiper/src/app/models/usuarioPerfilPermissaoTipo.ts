import {ChaveValor} from '../models/chaveValor';

export interface UsuarioPerfilPermissaoTipoDTO {
    id:number,
    categoria : ChaveValor,
    tipo: Object,
    valor : any,
}
