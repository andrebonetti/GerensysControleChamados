import {ChaveValor} from '../models/chaveValor';

export interface UsuarioPerfilPermissaoTipoDTO {
    id:number,
    categoria : ChaveValor,
    tipo: string,
    chave: string,
    valor : any,
}
