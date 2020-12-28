INSERT INTO `usuario` (
    `id`,
    `ativo`,
    `data_criacao`,
    `data_modificacao`,
    `version`, `cpf`,
    `email`,
    `imagem`,
    `nome`,
    `senha`,
    `id_usuario_criacao`,
    `id_usuario_modificacao`,
    `id_perfil`) VALUES
(2, 1, now(), now(), 0, 24304936085, 'system@system.com', '', 'System', '1234', 2, NULL, 1),
(3, 1, now(), now(), 0, 82005877034, 'test@test.com', '', 'Test', '1234', 2, NULL, 1),
(4, 1, now(), now(), 0, 43181527823, 'dev@dev.com', '', 'Dev', '1234', 2, NULL, 1);