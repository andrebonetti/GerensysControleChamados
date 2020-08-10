import { ChaveValor } from '../models/chaveValor';

const muitoBaixa : ChaveValor =
{
  chave:"1",
  valor:"Muito Baixa"
};

const baixa : ChaveValor =
{
  chave:"2",
  valor:"Baixa"
};

const normal : ChaveValor =
{
  chave:"3",
  valor:"Normal"
};

const alta : ChaveValor =
{
  chave:"4",
  valor:"Alta"
};

const muitoAlta : ChaveValor =
{
  chave:"5",
  valor:"Muito Alta"
};

export const chamadoPrioridade = [
  muitoBaixa,
  baixa,
  normal,
  alta,
  muitoAlta
]
