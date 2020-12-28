CREATE TABLE `usuario` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `cpf` bigint(20) NOT NULL,
  `email` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `imagem` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `nome` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `senha` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL,
  `id_perfil` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;