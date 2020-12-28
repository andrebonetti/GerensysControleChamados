INSERT INTO `fila`
    (`id`,
    `ativo`,
    `data_criacao`,
    `data_modificacao`,
    `version`,
    `color_style`,
    `nome`,
    `ordem`,
    `id_usuario_criacao`,
    `id_usuario_modificacao`) VALUES
(5, 1, now(), now(), 0, '#ffc107', 'Em Aberto', 1, 2, NULL),
(6, 1, now(), now(), 0, '#17a2b8', 'Em Andamento', 2, 2, NULL),
(7, 1, now(), now(), 0, '#28a745', 'Finalizados', 3, 2, NULL);