import { ChamadoCategoriaDTO } from "./chamadoCategoria";

export interface ChamadoSubCategoriaDTO {
    id:number,
    categoriaDTO:ChamadoCategoriaDTO
    descricao: string
}
