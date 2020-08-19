import { EmpresaDTO } from '../models/empresa';

const gerensys : EmpresaDTO =
{
  id: 1,
  imagem : "logo_exemplo.gif",
  nome: "Gerensys"
};

const Empresa1MOCK : EmpresaDTO =
{
  id: 2,
  imagem : "logo_exemplo.gif",
  nome: "Empresa 1"
};

const Empresa2MOCK : EmpresaDTO =
{
  id: 3,
  imagem : "logo_exemplo.gif",
  nome: "Empresa 2"
};

const Empresa3MOCK : EmpresaDTO =
{
  id: 4,
  imagem : "logo_exemplo.gif",
  nome: "Empresa 3"
};

export const empresaMOCK = {
  empresas : [Empresa1MOCK,Empresa2MOCK,Empresa3MOCK],
  gerensys : gerensys,
  case1 : Empresa1MOCK,
  case2 : Empresa2MOCK,
  case3 : Empresa3MOCK
}
