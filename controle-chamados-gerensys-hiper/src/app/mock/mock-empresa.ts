import { EmpresaDTO } from '../models/empresa';

const gerensys : EmpresaDTO =
{
  id: 1,
  imagem : "logo_exemplo.gif",
  razaoSocial: "Gerensys",
  cnpj: 41064682000183
};

const Empresa1MOCK : EmpresaDTO =
{
  id: 2,
  imagem : "logo_exemplo.gif",
  razaoSocial: "Empresa 1",
  cnpj: 90214746000190
};

const Empresa2MOCK : EmpresaDTO =
{
  id: 3,
  imagem : "logo_exemplo.gif",
  razaoSocial: "Empresa 2",
  cnpj: 67626081000100
};

const Empresa3MOCK : EmpresaDTO =
{
  id: 4,
  imagem : "logo_exemplo.gif",
  razaoSocial: "Empresa 3",
  cnpj: 39180444000191
};

export const empresaMOCK = {
  empresas : [Empresa1MOCK,Empresa2MOCK,Empresa3MOCK],
  gerensys : gerensys,
  case1 : Empresa1MOCK,
  case2 : Empresa2MOCK,
  case3 : Empresa3MOCK
}
