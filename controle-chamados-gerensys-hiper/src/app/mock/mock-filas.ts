import { FilaDTO } from '../models/fila';
import {ChamadosEmAbertoMOCK,ChamadosEmAndamentoMOCK,ChamadosFinalizadosMOCK } from '../mock/mock-chamados';

export const FilasMOCK : FilaDTO[] = [
  {
    id:1,
    nome:"Em Aberto",
    quantidade:3,
    chamadosDTO : ChamadosEmAbertoMOCK
  },
  {
    id:2,
    nome:"Em Andamento",
    quantidade:2,
    chamadosDTO : ChamadosEmAndamentoMOCK
  },
  {
    id:3,
    nome:"Finalizados",
    quantidade:5,
    chamadosDTO : ChamadosFinalizadosMOCK
  }
];
