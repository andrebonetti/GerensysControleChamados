import { ChamadoCategoria1MOCK,ChamadoCategoria2MOCK,ChamadoCategoria3MOCK,ChamadoCategoria4MOCK } from './mock-chamado-categoria';
import { ChamadoSubCategoriaDTO } from '../models/chamadoSubCategoria';

export const ChamadoSubCategoria1MOCK : ChamadoSubCategoriaDTO =
{
  id: 1,
  categoriaDTO : ChamadoCategoria1MOCK,
  descricao: "SubCategoria 1"
};

export const ChamadoSubCategoria2MOCK : ChamadoSubCategoriaDTO =
{
  id: 2,
  categoriaDTO : ChamadoCategoria1MOCK,
  descricao: "SubCategoria 2"
};

export const ChamadoSubCategoria3MOCK : ChamadoSubCategoriaDTO =
{
  id: 3,
  categoriaDTO : ChamadoCategoria2MOCK,
  descricao: "SubCategoria 3"
};

export const ChamadoSubCategoria4MOCK : ChamadoSubCategoriaDTO =
{
  id: 4,
  categoriaDTO : ChamadoCategoria2MOCK,
  descricao: "SubCategoria 4"
};

export const ChamadoSubCategoria5MOCK : ChamadoSubCategoriaDTO =
{
  id: 5,
  categoriaDTO : ChamadoCategoria3MOCK,
  descricao: "SubCategoria 5"
};

export const ChamadoSubCategoria6MOCK : ChamadoSubCategoriaDTO =
{
  id: 6,
  categoriaDTO : ChamadoCategoria4MOCK,
  descricao: "SubCategoria 6"
};
