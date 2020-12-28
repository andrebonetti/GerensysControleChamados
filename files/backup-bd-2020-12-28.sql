-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 179.188.16.50
-- Generation Time: 28-Dez-2020 às 01:38
-- Versão do servidor: 5.6.35-81.0-log
-- PHP Version: 5.6.40-0+deb8u12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `andretemp`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `categoria`
--

CREATE TABLE `categoria` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `descricao` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `chamado`
--

CREATE TABLE `chamado` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `titulo` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL,
  `id_empresa` bigint(20) NOT NULL,
  `id_fila` bigint(20) NOT NULL,
  `id_sub_categoria` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `cnpj` bigint(20) NOT NULL,
  `imagem` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `razao_social` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `fila`
--

CREATE TABLE `fila` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) DEFAULT NULL,
  `color_style` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `nome` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `ordem` int(11) DEFAULT NULL,
  `id_usuario_criacao` bigint(20) NOT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `fila`
--

INSERT INTO `fila` (`id`, `ativo`, `data_criacao`, `data_modificacao`, `version`, `color_style`, `nome`, `ordem`, `id_usuario_criacao`, `id_usuario_modificacao`) VALUES
(5, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, '#ffc107', 'Em Aberto', 1, 2, NULL),
(6, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, '#17a2b8', 'Em Andamento', 2, 2, NULL),
(7, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, '#28a745', 'Finalizados', 3, 2, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `flyway_schema_history`
--

CREATE TABLE `flyway_schema_history` (
  `installed_rank` int(11) NOT NULL,
  `version` varchar(50) COLLATE latin1_general_ci DEFAULT NULL,
  `description` varchar(200) COLLATE latin1_general_ci NOT NULL,
  `type` varchar(20) COLLATE latin1_general_ci NOT NULL,
  `script` varchar(1000) COLLATE latin1_general_ci NOT NULL,
  `checksum` int(11) DEFAULT NULL,
  `installed_by` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int(11) NOT NULL,
  `success` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `flyway_schema_history`
--

INSERT INTO `flyway_schema_history` (`installed_rank`, `version`, `description`, `type`, `script`, `checksum`, `installed_by`, `installed_on`, `execution_time`, `success`) VALUES
(1, '1.1', 'create hibernatesequence', 'SQL', 'V1.1__create_hibernatesequence.sql', -1606877000, 'andretemp', '2020-12-28 04:33:44', 109, 1),
(2, '2.1', 'create perfil', 'SQL', 'V2.1__create_perfil.sql', 236961487, 'andretemp', '2020-12-28 04:33:44', 214, 1),
(3, '2.2', 'initial load perfil', 'SQL', 'V2.2__initial_load_perfil.sql', -1535095845, 'andretemp', '2020-12-28 04:33:44', 81, 1),
(4, '2.3', 'create usuario', 'SQL', 'V2.3__create_usuario.sql', -279445122, 'andretemp', '2020-12-28 04:33:44', 82, 1),
(5, '2.4', 'initial load usuario', 'SQL', 'V2.4__initial_load_usuario.sql', 971716479, 'andretemp', '2020-12-28 04:33:45', 64, 1),
(6, '2.5', 'create fila', 'SQL', 'V2.5__create_fila.sql', 1422714181, 'andretemp', '2020-12-28 04:33:45', 163, 1),
(7, '2.6', 'initial load fila', 'SQL', 'V2.6__initial_load_fila.sql', -642372753, 'andretemp', '2020-12-28 04:33:45', 97, 1),
(8, '999.1', 'update hibernate', 'SQL', 'V999.1__update_hibernate.sql', 1662092819, 'andretemp', '2020-12-28 04:33:45', 62, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `formulario_input`
--

CREATE TABLE `formulario_input` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `tipo` int(11) DEFAULT NULL,
  `valor` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(8),
(8),
(8),
(8),
(8),
(8),
(8),
(8),
(8),
(8);

-- --------------------------------------------------------

--
-- Estrutura da tabela `historico`
--

CREATE TABLE `historico` (
  `id` bigint(20) NOT NULL,
  `dados` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `data_acao` datetime DEFAULT NULL,
  `id_registro` bigint(20) DEFAULT NULL,
  `tabela` int(11) DEFAULT NULL,
  `tipo_acao` int(11) DEFAULT NULL,
  `usuario_acao` tinyblob,
  `version` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

CREATE TABLE `perfil` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `descricao` varchar(255) COLLATE latin1_general_ci NOT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Extraindo dados da tabela `perfil`
--

INSERT INTO `perfil` (`id`, `ativo`, `data_criacao`, `data_modificacao`, `version`, `descricao`, `id_usuario_criacao`, `id_usuario_modificacao`) VALUES
(1, b'1', '2020-12-28 01:33:44', '2020-12-28 04:33:44', 0, 'Master', 2, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `solucao_tecnica`
--

CREATE TABLE `solucao_tecnica` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `concluido` bit(1) DEFAULT NULL,
  `descricao` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `tipo` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `sub_categoria`
--

CREATE TABLE `sub_categoria` (
  `id` bigint(20) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `data_criacao` datetime NOT NULL,
  `data_modificacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `version` bigint(20) NOT NULL,
  `descricao` varchar(255) COLLATE latin1_general_ci DEFAULT NULL,
  `id_usuario_criacao` bigint(20) DEFAULT NULL,
  `id_usuario_modificacao` bigint(20) DEFAULT NULL,
  `id_categoria` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

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

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `ativo`, `data_criacao`, `data_modificacao`, `version`, `cpf`, `email`, `imagem`, `nome`, `senha`, `id_usuario_criacao`, `id_usuario_modificacao`, `id_perfil`) VALUES
(2, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, 24304936085, 'system@system.com', '', 'System', '1234', 2, NULL, 1),
(3, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, 82005877034, 'test@test.com', '', 'Test', '1234', 2, NULL, 1),
(4, b'1', '2020-12-28 01:33:45', '2020-12-28 04:33:45', 0, 43181527823, 'dev@dev.com', '', 'Dev', '1234', 2, NULL, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5lohvithhbbikefq5dbisiq53` (`id_usuario_criacao`),
  ADD KEY `FKsifsmkxifi7rj4u7nkmamw0s3` (`id_usuario_modificacao`);

--
-- Indexes for table `chamado`
--
ALTER TABLE `chamado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK745q5qqldr56q4v0lrh35tv5k` (`id_usuario_criacao`),
  ADD KEY `FK9qowh8cl61s9a3br6irmh611a` (`id_usuario_modificacao`),
  ADD KEY `FKotdtnl20dxvl7sgnbk573che` (`id_empresa`),
  ADD KEY `FKq59tf0qw1c841u66jqtcmc2c2` (`id_fila`),
  ADD KEY `FK13x2e8gwtlhk6veus20794jth` (`id_sub_categoria`);

--
-- Indexes for table `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKp0xjy0xjiniq5iyabrq6hbi05` (`id_usuario_criacao`),
  ADD KEY `FKd040r7ypbngikepur69vggnhk` (`id_usuario_modificacao`);

--
-- Indexes for table `fila`
--
ALTER TABLE `fila`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4ymtx8yc39fkbihe9udpab91q` (`id_usuario_criacao`),
  ADD KEY `FK82fp52qnboaf9vnmn8vj774vh` (`id_usuario_modificacao`);

--
-- Indexes for table `flyway_schema_history`
--
ALTER TABLE `flyway_schema_history`
  ADD PRIMARY KEY (`installed_rank`),
  ADD KEY `flyway_schema_history_s_idx` (`success`);

--
-- Indexes for table `formulario_input`
--
ALTER TABLE `formulario_input`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKguwivu6004l0gflwgnath14qb` (`id_usuario_criacao`),
  ADD KEY `FKqehwu8w3h7om5qw3yncylllef` (`id_usuario_modificacao`);

--
-- Indexes for table `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKjjhtbd9jpodyg9y7a5p45dvek` (`id_usuario_criacao`),
  ADD KEY `FKt4geq2qv3iedn86yylyo726w8` (`id_usuario_modificacao`);

--
-- Indexes for table `solucao_tecnica`
--
ALTER TABLE `solucao_tecnica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKq47ksfgoowdfumctq4uxq2hc5` (`id_usuario_criacao`),
  ADD KEY `FKr24uavu2owvkq2tayro7p5gui` (`id_usuario_modificacao`);

--
-- Indexes for table `sub_categoria`
--
ALTER TABLE `sub_categoria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKeflfm6i07ynn9mmeop28uiwno` (`id_usuario_criacao`),
  ADD KEY `FKmbd3dp0kiv0t0b56xh33gjgoy` (`id_usuario_modificacao`),
  ADD KEY `FK77t6a8yve2t1vangqtb0vfrv4` (`id_categoria`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD KEY `FKavpv8kdepa6qlri3fq8y92hkw` (`id_usuario_criacao`),
  ADD KEY `FKlu79a8i1odnnhjky3mso2s5fq` (`id_usuario_modificacao`),
  ADD KEY `FK131gkl0dt1966rsw6dmesnsxw` (`id_perfil`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
