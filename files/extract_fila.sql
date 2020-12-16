-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 179.188.16.50
-- Generation Time: 16-Dez-2020 às 12:48
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
-- Estrutura da tabela `fila`
--

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

--
-- Extraindo dados da tabela `fila`
--

INSERT INTO `fila` (`id`, `ativo`, `data_criacao`, `data_modificacao`, `version`, `color_style`, `nome`, `ordem`, `id_usuario_criacao`, `id_usuario_modificacao`) VALUES
(1, b'1', '2020-12-16 12:43:03', '2020-12-16 15:43:03', 0, '#ffc107', 'Em Aberto', 1, NULL, NULL),
(2, b'1', '2020-12-16 12:43:29', '2020-12-16 15:43:29', 0, '#17a2b8', 'Em Andamento', 1, NULL, NULL),
(3, b'1', '2020-12-16 12:43:51', '2020-12-16 15:43:50', 0, '#28a745', 'Finalizados', 1, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fila`
--
ALTER TABLE `fila`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4ymtx8yc39fkbihe9udpab91q` (`id_usuario_criacao`),
  ADD KEY `FK82fp52qnboaf9vnmn8vj774vh` (`id_usuario_modificacao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
