export interface ChecklistDTO {
  id:number,
  tipo:string,
  descricao:string,
  concluido: Boolean
}

export interface ChamadoSolucaoTecnicaDTO {
    checklistGeralDTO :ChecklistDTO[],
    checklistCriteriosDTO : ChecklistDTO[],
    checklistTestesDTO:ChecklistDTO[]
}
