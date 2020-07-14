import { ChamadoDTO } from '../models/chamado';
import { Cliente1MOCK,Cliente2MOCK,Cliente3MOCK } from '../mock/mock-cliente';
import { UsuarioResponsavel1MOCK,UsuarioResponsavel2MOCK,UsuarioResponsavel3MOCK } from '../mock/mock-usuarioResponsavel';

export const ChamadosMOCK : ChamadoDTO[] = [
  {
    id:12345,
    titulo: "Titulo Chamado 1",
    sla:"1D 12:00h",
    clienteDTO : Cliente1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK
  },
  {
    id:6789,
    titulo: "Titulo Chamado 2",
    sla:"1D 13:00h",
    clienteDTO : Cliente2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK
  },
  {
    id:9876,
    titulo: "Titulo Chamado 3",
    sla:"1D 10:00h",
    clienteDTO : Cliente3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK
  }
];

export const ChamadosEmAbertoMOCK : ChamadoDTO[] = [
  {
    id:12345,
    titulo: "Titulo Chamado 1",
    sla:"1D 12:00h",
    clienteDTO : Cliente1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK
  },
  {
    id:6789,
    titulo: "Titulo Chamado 2",
    sla:"1D 13:00h",
    clienteDTO : Cliente2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK
  },
  {
    id:9876,
    titulo: "Titulo Chamado 3",
    sla:"1D 10:00h",
    clienteDTO : Cliente3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK
  }
];

export const ChamadosEmAndamentoMOCK : ChamadoDTO[] = [
  {
    id:2837,
    titulo: "Titulo Chamado 4",
    sla:"1D 17:00h",
    clienteDTO : Cliente1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 5",
    sla:"1D 18:00h",
    clienteDTO : Cliente2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK
  }
];

export const ChamadosFinalizadosMOCK : ChamadoDTO[] = [
  {
    id:2837,
    titulo: "Titulo Chamado 6",
    sla:"1D 19:00h",
    clienteDTO : Cliente1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 7",
    sla:"1D 20:00h",
    clienteDTO : Cliente2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 8",
    sla:"1D 21:00h",
    clienteDTO : Cliente3MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel3MOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 9",
    sla:"1D 22:00h",
    clienteDTO : Cliente1MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel1MOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 10",
    sla:"1D 23:00h",
    clienteDTO : Cliente2MOCK,
    usuarioResponsavelDTO : UsuarioResponsavel2MOCK
  }
];
