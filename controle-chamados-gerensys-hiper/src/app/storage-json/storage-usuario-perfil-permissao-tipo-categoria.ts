import { ChaveValor } from '../models/chaveValor';

const usuarioPerfilPermissaoTipoCategoriaFila : ChaveValor =
{
  chave : "fila",
  valor : "Filas"
};

const usuarioPerfilPermissaoTipoCategoriaConfig : ChaveValor =
{
  chave : "configuracoes",
  valor : "Configurações"
};

export const usuariosPerfilPermissaoTipoCategoria = [
  usuarioPerfilPermissaoTipoCategoriaFila,
  usuarioPerfilPermissaoTipoCategoriaConfig
]

export const usuarioPerfilPermissaoTipoCategorias = {
  usuarioPerfilPermissaoTipoCategoriaFila : usuarioPerfilPermissaoTipoCategoriaFila,
  usuarioPerfilPermissaoTipoCategoriaConfig : usuarioPerfilPermissaoTipoCategoriaConfig
}
