import { ChamadoFormularioInputDTO } from '../models/chamadoFormularioInput';
import { InputTipoEnum } from '../models/enums/input_tipo';

export const ChamadoFormularioInput1MOCK : ChamadoFormularioInputDTO =
{
  id: 1,
  tipo : InputTipoEnum.TEXTAREA,
  valor: "Chamado textarea"
};

export const ChamadoFormularioInput2MOCK : ChamadoFormularioInputDTO =
{
  id: 2,
  tipo : InputTipoEnum.TEXT,
  valor: "Chamado input text"
};

export const ChamadoFormularioInputs1MOCK : ChamadoFormularioInputDTO[] =
[ChamadoFormularioInput1MOCK,ChamadoFormularioInput2MOCK];
