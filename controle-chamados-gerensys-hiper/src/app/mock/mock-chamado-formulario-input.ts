import { ChamadoFormularioInputDTO } from '../models/chamadoFormularioInput';
import { InputTipoEnum } from '../models/enums/input_tipo';

const ChamadoFormularioInput1MOCK : ChamadoFormularioInputDTO =
{
  id: 1,
  tipo : InputTipoEnum.TEXTAREA,
  valor: "Chamado textarea"
};

const ChamadoFormularioInput2MOCK : ChamadoFormularioInputDTO =
{
  id: 2,
  tipo : InputTipoEnum.TEXT,
  valor: "Chamado input text"
};

const ChamadoFormularioInputs1MOCK : ChamadoFormularioInputDTO[] =
[ChamadoFormularioInput1MOCK,ChamadoFormularioInput2MOCK];

export const chamadoFormularioInputMOCK = {
  listaCase1 : ChamadoFormularioInputs1MOCK
}
