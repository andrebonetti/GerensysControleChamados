import { FilaDTO } from '../models/fila';
import { chamadosMOCK } from '../mock/mock-chamados';

const FilaEmAbertoFullMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  cssClass:["em-aberto"],
  quantidade:3,
  colorStyle: "#ffc107",
  chamadosDTO : chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 1 )
}

const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  cssClass:["em-aberto"],
  quantidade:3,
  colorStyle: "#ffc107",
  chamadosDTO : []
}

const FilaEmAndamentoFullMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  cssClass:["em-andamento"],
  quantidade:2,
  colorStyle: "#17a2b8",
  chamadosDTO : []//chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 2 )
}

const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  cssClass:["em-andamento"],
  quantidade:2,
  colorStyle: "#17a2b8",
  chamadosDTO : []
}


const FilaFinalizadosFullMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  cssClass:["finalizados"],
  quantidade:5,
  colorStyle: "#28a745",
  chamadosDTO : []//chamadosMOCK.filter( itemChamado => itemChamado.filaDTO.id == 3 )
}

const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  cssClass:["finalizados"],
  quantidade:5,
  colorStyle: "#28a745",
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
