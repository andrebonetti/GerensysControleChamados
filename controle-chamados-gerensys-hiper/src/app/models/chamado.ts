import { ClienteDTO } from '../models/cliente';
import { UsuarioResponsavelDTO } from '../models/usuarioResponsavel';
import { ChamadoSubCategoriaDTO } from '../models/chamadoSubCategoria';
import { FilaDTO } from '../models/fila';

export interface ChamadoDTO {
    id:number,
    titulo: string,
    sla:string,
    clienteDTO : ClienteDTO,
    subCategoriaDTO: ChamadoSubCategoriaDTO,
    usuarioResponsavelDTO : UsuarioResponsavelDTO,
    filaDTO : FilaDTO
}
