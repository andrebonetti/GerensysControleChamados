import { ChaveValor } from '../models/chaveValor';

const usuarioPerfilPermissaoTipoCategoriaTela : ChaveValor =
{
  chave : "tela",
  valor : "Telas"
};

const usuarioPerfilPermissaoTipoCategoriaFila : ChaveValor =
{
  chave : "fila",
  valor : "Filas"
};

const usuarioPerfilPermissaoTipoCategoriaConfig : ChaveValor =
{
  chave : "configuracao",
  valor : "Configurações"
};

export const usuariosPerfilPermissaoTipoCategoria = [
  usuarioPerfilPermissaoTipoCategoriaTela,
  usuarioPerfilPermissaoTipoCategoriaFila,
  usuarioPerfilPermissaoTipoCategoriaConfig
]
