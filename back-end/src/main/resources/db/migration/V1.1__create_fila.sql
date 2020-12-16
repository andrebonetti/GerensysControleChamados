CREATE TABLE `fila` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) DEFAULT NULL,
  `data_criacao` datetime DEFAULT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) DEFAULT NULL,
  `color_style` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `nome` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `ordem` int(11) DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

ALTER TABLE `fila`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4ymtx8yc39fkbihe9udpab91q` (`id_usuario_criacao`),
  ADD KEY `FK82fp52qnboaf9vnmn8vj774vh` (`id_usuario_modificacao`);
COMMIT;