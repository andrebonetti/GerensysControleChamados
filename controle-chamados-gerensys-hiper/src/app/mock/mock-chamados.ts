import { ChamadoDTO } from '../models/chamado';
import { FilaDTO } from '../models/fila';
import {
  Cliente1MOCK,
  Cliente2MOCK,
  Cliente3MOCK
} from '../mock/mock-cliente';
import {
  UsuarioResponsavel1MOCK,
  UsuarioResponsavel2MOCK,
  UsuarioResponsavel3MOCK
} from '../mock/mock-usuarioResponsavel';
import {
  ChamadoSubCategoria1MOCK,
  ChamadoSubCategoria2MOCK,
  ChamadoSubCategoria3MOCK,
  ChamadoSubCategoria4MOCK,
  ChamadoSubCategoria5MOCK,
  ChamadoSubCategoria6MOCK
} from '../mock/mock-chamado-sub-categoria';


const FilaEmAbertoMOCK : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  quantidade:3,
  chamadosDTO : []
}

const FilaEmAndamentoMOCK : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  quantidade:2,
  chamadosDTO : []
}

const FilaFinalizadosMOCK : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  quantidade:5,
  chamadosDTO : []
}

export const ChamadosMOCK : ChamadoDTO[] = [
  {
    id:12345,
    titulo: "Titulo Chamado 1",
    sla:"1D 12:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaEmAbertoMOCK
  },
  {
    id:6789,
    titulo: "Titulo Chamado 2",
    sla:"1D 13:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaEmAbertoMOCK
  },
  {
    id:9876,
    titulo: "Titulo Chamado 3",
    sla:"1D 10:00h",
    clienteDTO : Cliente3MOCK,
    subCategoriaDTO : ChamadoSubCategoria3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK,
    filaDTO : FilaEmAbertoMOCK
  },
  {
    id:2837,
    titulo: "Titulo Chamado 4",
    sla:"1D 17:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria6MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaEmAndamentoMOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 5",
    sla:"1D 18:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria5MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaEmAndamentoMOCK
  },
  {
    id:1432,
    titulo: "Titulo Chamado 6",
    sla:"1D 19:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria4MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaEmAndamentoMOCK
  },
  {
    id:6512,
    titulo: "Titulo Chamado 7",
    sla:"1D 20:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:12346,
    titulo: "Titulo Chamado 8",
    sla:"1D 21:00h",
    clienteDTO : Cliente3MOCK,
    subCategoriaDTO : ChamadoSubCategoria2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:9532,
    titulo: "Titulo Chamado 9",
    sla:"1D 22:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:4452,
    titulo: "Titulo Chamado 10",
    sla:"1D 23:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaFinalizadosMOCK
  }
];

export const ChamadosEmAbertoMOCK : ChamadoDTO[] = [
  {
    id:12345,
    titulo: "Titulo Chamado 1",
    sla:"1D 12:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria4MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaEmAbertoMOCK
  },
  {
    id:6789,
    titulo: "Titulo Chamado 2",
    sla:"1D 13:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria5MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaEmAbertoMOCK
  },
  {
    id:9876,
    titulo: "Titulo Chamado 3",
    sla:"1D 10:00h",
    clienteDTO : Cliente3MOCK,
    subCategoriaDTO : ChamadoSubCategoria6MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK,
    filaDTO : FilaEmAbertoMOCK
  }
];

export const ChamadosEmAndamentoMOCK : ChamadoDTO[] = [
  {
    id:2837,
    titulo: "Titulo Chamado 4",
    sla:"1D 17:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria6MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaEmAndamentoMOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 5",
    sla:"1D 18:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria5MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaEmAndamentoMOCK
  }
];

export const ChamadosFinalizadosMOCK : ChamadoDTO[] = [
  {
    id:1432,
    titulo: "Titulo Chamado 6",
    sla:"1D 19:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria4MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:6512,
    titulo: "Titulo Chamado 7",
    sla:"1D 20:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:12346,
    titulo: "Titulo Chamado 8",
    sla:"1D 21:00h",
    clienteDTO : Cliente3MOCK,
    subCategoriaDTO : ChamadoSubCategoria2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:9532,
    titulo: "Titulo Chamado 9",
    sla:"1D 22:00h",
    clienteDTO : Cliente1MOCK,
    subCategoriaDTO : ChamadoSubCategoria1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK,
    filaDTO : FilaFinalizadosMOCK
  },
  {
    id:4452,
    titulo: "Titulo Chamado 10",
    sla:"1D 23:00h",
    clienteDTO : Cliente2MOCK,
    subCategoriaDTO : ChamadoSubCategoria2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK,
    filaDTO : FilaFinalizadosMOCK
  }
];
