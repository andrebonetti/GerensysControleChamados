import { FilaDTO } from '../models/fila';
import {ChamadosEmAbertoMOCK,ChamadosEmAndamentoMOCK,ChamadosFinalizadosMOCK } from '../mock/mock-chamados';

export const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : ChamadosEmAbertoMOCK
}

export const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : ChamadosEmAndamentoMOCK
}

export const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : ChamadosFinalizadosMOCK
}

export const FilasMOCK : FilaDTO[] = [
  FilaEmAbertoMOCK,
  FilaEmAndamentoMOCK,
  FilaFinalizadosMOCK
];
