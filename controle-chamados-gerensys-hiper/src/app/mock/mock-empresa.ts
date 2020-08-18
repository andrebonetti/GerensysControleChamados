import { EmpresaDTO } from '../models/empresa';

const gerensys : EmpresaDTO =
{
  id: 1,
  imagem : "src",
  nome: "Gerensys"
};

const Empresa1MOCK : EmpresaDTO =
{
  id: 2,
  imagem : "src",
  nome: "Empresa 1"
};

const Empresa2MOCK : EmpresaDTO =
{
  id: 3,
  imagem : "src",
  nome: "Empresa 2"
};

const Empresa3MOCK : EmpresaDTO =
{
  id: 4,
  imagem : "src",
  nome: "Empresa 3"
};

export const empresaMOCK = {
  empresas : [Empresa1MOCK,Empresa2MOCK,Empresa3MOCK],
  gerensys : gerensys,
  case1 : Empresa1MOCK,
  case2 : Empresa2MOCK,
  case3 : Empresa3MOCK
}
