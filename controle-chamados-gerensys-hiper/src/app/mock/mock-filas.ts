import { FilaDTO } from '../models/fila';
import { chamadosMOCK } from '../mock/mock-chamados';

const FilaEmAbertoFullMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 1 )
}

const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : []
}

const FilaEmAndamentoFullMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 2 )
}

const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : []
}


const FilaFinalizadosFullMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 3 )
}

const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : []
}

const filasFullMOCK : FilaDTO[] = [
  FilaEmAbertoFullMOCK,
  FilaEmAndamentoFullMOCK,
  FilaFinalizadosFullMOCK
];

const filasMOCK : FilaDTO[] = [
  FilaEmAbertoMOCK,
  FilaEmAndamentoMOCK,
  FilaFinalizadosMOCK
];

export const filaMOCK = {
  lista : filasMOCK,
  listaFull : filasFullMOCK,
}
