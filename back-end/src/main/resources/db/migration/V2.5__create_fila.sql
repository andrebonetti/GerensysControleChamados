CREATE TABLE `fila` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NULL,
  `color_style` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `nome` varchar(255) COLLATE latin1_general_ci NOT NULl,
  `ordem` int(11) DEFAULT NULL,
  `id_usuario_criacao` bigint(20) NOT NULl,
  `id_usuario_modificacao` bigint(20) NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

ALTER TABLE `fila`
  ADD PRIMARY KEY (`id`);

COMMIT;