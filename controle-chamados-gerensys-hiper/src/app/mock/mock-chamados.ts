import { ChamadoDTO } from '../models/chamado';
import { empresaMOCK } from './mock-empresa';
import { usuarioMOCK } from './mock-usuario';
import { FilaDTO } from '../models/fila';
import { chamadoSubCategoriaMOCK } from '../mock/mock-chamado-sub-categoria';
import { chamadoFormularioInputMOCK } from '../mock/mock-chamado-formulario-input'
import { chamadoSolucaoTecnicaMOCK } from '../mock/mock-chamado-solucao-tecnica'

const FilaEmAbertoMOCKPai : FilaDTO =
{
  id:1,
  nome:"Em Aberto",
  cssClass:["em-aberto"],
  quantidade:3,
  colorStyle: "#ffc107",
  chamadosDTO : []
}

const FilaEmAndamentoMOCKPai : FilaDTO =
{
  id:2,
  nome:"Em Andamento",
  cssClass:["em-andamento"],
  quantidade:2,
  colorStyle: "#17a2b8",
  chamadosDTO : []
}

const FilaFinalizadosMOCKPai : FilaDTO =
{
  id:3,
  nome:"Finalizados",
  cssClass:["finalizados"],
  quantidade:5,
  colorStyle: "#28a745",
  chamadosDTO : []
}

const filaMOCK = {
  emAbertoPai : FilaEmAbertoMOCKPai,
  emAndamentoPai : FilaEmAndamentoMOCKPai,
  finalizadosPai : FilaFinalizadosMOCKPai
}

export const chamadosMOCK : ChamadoDTO[] = [
  {
    id:12345,
    titulo: "Titulo Chamado 1",
    sla:"1D 12:00h",
    clienteDTO : empresaMOCK.case1,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case1,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis1MOCK,
    filaDTO : filaMOCK.emAbertoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao1MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:6789,
    titulo: "Titulo Chamado 2",
    sla:"1D 13:00h",
    clienteDTO : empresaMOCK.case2,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case2,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis2MOCK,
    filaDTO : filaMOCK.emAbertoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao2MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:9876,
    titulo: "Titulo Chamado 3",
    sla:"1D 10:00h",
    clienteDTO : empresaMOCK.case3,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case3,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveisMultiMOCK,
    filaDTO : filaMOCK.emAbertoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao3MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:2837,
    titulo: "Titulo Chamado 4",
    sla:"1D 17:00h",
    clienteDTO : empresaMOCK.case1,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case6,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis1MOCK,
    filaDTO : filaMOCK.emAndamentoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao2MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:5123,
    titulo: "Titulo Chamado 5",
    sla:"1D 18:00h",
    clienteDTO : empresaMOCK.case2,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case5,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis2MOCK,
    filaDTO : filaMOCK.emAndamentoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao2MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:1432,
    titulo: "Titulo Chamado 6",
    sla:"1D 19:00h",
    clienteDTO : empresaMOCK.case1,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case4,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis1MOCK,
    filaDTO : filaMOCK.emAndamentoPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao3MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:6512,
    titulo: "Titulo Chamado 7",
    sla:"1D 20:00h",
    clienteDTO : empresaMOCK.case2,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case3,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis2MOCK,
    filaDTO : filaMOCK.finalizadosPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao1MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:12346,
    titulo: "Titulo Chamado 8",
    sla:"1D 21:00h",
    clienteDTO : empresaMOCK.case3,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case2,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis3MOCK,
    filaDTO : filaMOCK.finalizadosPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao2MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:9532,
    titulo: "Titulo Chamado 9",
    sla:"1D 22:00h",
    clienteDTO : empresaMOCK.case1,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case1,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis1MOCK,
    filaDTO : filaMOCK.finalizadosPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao3MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  },
  {
    id:4452,
    titulo: "Titulo Chamado 10",
    sla:"1D 23:00h",
    clienteDTO : empresaMOCK.case2,
    subCategoriaDTO : chamadoSubCategoriaMOCK.case2,
    usuariosResponsaveisDTO : usuarioMOCK.usuariosResponsaveis2MOCK,
    filaDTO : filaMOCK.finalizadosPai,
    formularioInputsDTO : chamadoFormularioInputMOCK.listaCase1,
    usuarioCriacaoDTO : usuarioMOCK.usuarioCriacao1MOCK,
    dataCriacao : new Date(),
    solucaoTecnica : chamadoSolucaoTecnicaMOCK
  }
];
