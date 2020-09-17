import { ChamadoDTO } from './chamado';

export interface FilaDTO {
    id:number,
    nome: string,
    cssClass : String[],
    quantidade:number,
    colorStyle: string,
    chamadosDTO : ChamadoDTO[]
}
