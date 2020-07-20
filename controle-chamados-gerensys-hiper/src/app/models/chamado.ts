import { EmpresaDTO } from './empresa';
import { UsuarioDTO } from './usuario';
import { ChamadoSubCategoriaDTO } from '../models/chamadoSubCategoria';
import { FilaDTO } from '../models/fila';
import { ChamadoFormularioInputDTO } from './chamadoFormularioInput';
import { ChamadoSolucaoTecnicaDTO } from './chamadoSolucaoTecnica'

export interface ChamadoDTO {
    id:number,
    titulo: string,
    sla:string,
    clienteDTO : EmpresaDTO,
    subCategoriaDTO: ChamadoSubCategoriaDTO,
    usuariosResponsaveisDTO : UsuarioDTO[],
    usuarioCriacaoDTO : UsuarioDTO,
    dataCriacao : Date,
    filaDTO : FilaDTO,
    formularioInputsDTO : ChamadoFormularioInputDTO[],
    solucaoTecnica : ChamadoSolucaoTecnicaDTO
}

export const chamadoDTOClear : ChamadoDTO = {
  id:null,
  titulo: null,
  sla:null,
  clienteDTO : null,
  subCategoriaDTO: null,
  usuariosResponsaveisDTO : null,
  usuarioCriacaoDTO : null,
  dataCriacao : null,
  filaDTO : null,
  formularioInputsDTO : null,
  solucaoTecnica : null
}
