import { FilaDTO } from '../models/fila';
import { ChamadosMOCK } from '../mock/mock-chamados';

export const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : ChamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 1 )
}

export const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : ChamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 2 )
}

export const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : ChamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 3 )
}

export const FilasMOCK : FilaDTO[] = [
  FilaEmAbertoMOCK,
  FilaEmAndamentoMOCK,
  FilaFinalizadosMOCK
];
