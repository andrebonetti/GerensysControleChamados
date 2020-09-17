import { chamadoCategoriaMOCK } from './mock-chamado-categoria';
import { ChamadoSubCategoriaDTO } from '../models/chamadoSubCategoria';

const ChamadoSubCategoria1MOCK : ChamadoSubCategoriaDTO =
{
  id: 1,
  categoriaDTO : chamadoCategoriaMOCK.case1,
  descricao: "SubCategoria 1"
};

const ChamadoSubCategoria2MOCK : ChamadoSubCategoriaDTO =
{
  id: 2,
  categoriaDTO : chamadoCategoriaMOCK.case1,
  descricao: "SubCategoria 2"
};

const ChamadoSubCategoria3MOCK : ChamadoSubCategoriaDTO =
{
  id: 3,
  categoriaDTO : chamadoCategoriaMOCK.case2,
  descricao: "SubCategoria 3"
};

const ChamadoSubCategoria4MOCK : ChamadoSubCategoriaDTO =
{
  id: 4,
  categoriaDTO : chamadoCategoriaMOCK.case2,
  descricao: "SubCategoria 4"
};

const ChamadoSubCategoria5MOCK : ChamadoSubCategoriaDTO =
{
  id: 5,
  categoriaDTO : chamadoCategoriaMOCK.case3,
  descricao: "SubCategoria 5"
};

const ChamadoSubCategoria6MOCK : ChamadoSubCategoriaDTO =
{
  id: 6,
  categoriaDTO : chamadoCategoriaMOCK.case4,
  descricao: "SubCategoria 6"
};

export const chamadoSubCategoriaMOCK = {
  case1 : ChamadoSubCategoria1MOCK,
  case2 : ChamadoSubCategoria2MOCK,
  case3 : ChamadoSubCategoria3MOCK,
  case4 : ChamadoSubCategoria4MOCK,
  case5 : ChamadoSubCategoria5MOCK,
  case6 : ChamadoSubCategoria6MOCK,
  lista : [ChamadoSubCategoria1MOCK,ChamadoSubCategoria2MOCK,ChamadoSubCategoria3MOCK,ChamadoSubCategoria4MOCK,
  ChamadoSubCategoria5MOCK,ChamadoSubCategoria6MOCK]
}
