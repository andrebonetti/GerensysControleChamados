package com.controlechamados.historico;

import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class HistoricoService {

    public void criarHistoricoRegistro(HistoricoParam historicoParam){

        Usuario usuarioCriacao = UsuarioMock.usuarioCriacao();

        new Historico().builder()
            .withId( UUID.randomUUID() )
            .withTabela( historicoParam.getTabelaEnum() )
//TODO            .withIdRegistro( historicoParam.getEntity().getId() )
            .withTipoAcao( historicoParam.getAcaoEnum() )
            .withDataAcao( LocalDate.now() )
            .withUsuarioAcao( usuarioCriacao )
            .withDados( historicoParam.getEntity().toString() )
            .build();

    }


}
