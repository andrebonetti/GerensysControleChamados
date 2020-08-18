import { ChamadoDTO } from './chamado';

export interface FilaDTO {
    id:number,
    nome: string,
    quantidade:number,
    colorStyle: string,
    chamadosDTO : ChamadoDTO[]
}
