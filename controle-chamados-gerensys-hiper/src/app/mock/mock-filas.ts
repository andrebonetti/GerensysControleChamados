import { FilaDTO } from '../models/fila';
import { chamadosMOCK } from '../mock/mock-chamados';

const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 1 )
}

const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 2 )
}

const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 3 )
}

const filasMOCK : FilaDTO[] = [
  FilaEmAbertoMOCK,
  FilaEmAndamentoMOCK,
  FilaFinalizadosMOCK
];

export const filaMOCK = {
  lista : filasMOCK
}
