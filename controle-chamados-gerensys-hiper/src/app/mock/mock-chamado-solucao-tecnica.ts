import { ChecklistDTO,ChamadoSolucaoTecnicaDTO } from '../models/chamadoSolucaoTecnica';
import { ChecklistTipoEnum } from '../models/enums/checklist_tipo';

const checklist1MOCK : ChecklistDTO = {
  id:1,
  tipo:ChecklistTipoEnum.CRITERIO_ACEITACAO,
  descricao: "item 1",
  concluido : false
}

const checklist2MOCK : ChecklistDTO = {
  id:1,
  tipo:ChecklistTipoEnum.CRITERIO_ACEITACAO,
  descricao: "item 2",
  concluido : true
}

const checklist3MOCK : ChecklistDTO = {
  id:1,
  tipo:ChecklistTipoEnum.TESTE,
  descricao: "item 1",
  concluido : false
}

const checklist4MOCK : ChecklistDTO = {
  id:1,
  tipo:ChecklistTipoEnum.TESTE,
  descricao: "item 2",
  concluido : true
}

const checklistLista : ChecklistDTO[] = [
  checklist1MOCK,checklist2MOCK,checklist3MOCK,checklist4MOCK
]

export const chamadoSolucaoTecnicaMOCK : ChamadoSolucaoTecnicaDTO =
{
  checklistCriteriosDTO : checklistLista.filter( itemChecklist => itemChecklist.tipo == ChecklistTipoEnum.CRITERIO_ACEITACAO),
  checklistTestesDTO : checklistLista.filter( itemChecklist => itemChecklist.tipo == ChecklistTipoEnum.TESTE),
  checklistGeralDTO : checklistLista
};
