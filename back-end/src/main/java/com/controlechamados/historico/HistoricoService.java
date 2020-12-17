package com.controlechamados.historico;

import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.springframework.stereotype.Service;

@Service
public class HistoricoService {

    private final HistoricoRepository historicoDAO;

    public HistoricoService(HistoricoRepository historicoDAO) {
        this.historicoDAO = historicoDAO;
    }

    public void criarHistoricoRegistro(HistoricoParam historicoParam){

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();

        Historico historico = new Historico().builder()
                .withTabela(historicoParam.getTabelaEnum())
                .withIdRegistro(historicoParam.getEntity().getId())
                .withTipoAcao(historicoParam.getAcaoEnum())
//TODO USUARIO LOGADO .withUsuarioAcao(usuarioCriacao)
                .withDados(historicoParam.getEntity().toString())
                .withVersion(historicoParam.getEntity().getVersion())
                .build();

        historicoDAO.save(historico);
    }


}
