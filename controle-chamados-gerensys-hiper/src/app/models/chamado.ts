import { ClienteDTO } from '../models/cliente';
import { UsuarioResponsavelDTO } from '../models/usuarioResponsavel';

export interface ChamadoDTO {
    id:number,
    titulo: string,
    sla:string,
    clienteDTO : ClienteDTO,
    usuarioResponsavelDTO : UsuarioResponsavelDTO
}
