package com.controlechamados.historico;

import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService {

    private final HistoricoRepository historicoDAO;

    public HistoricoService(HistoricoRepository historicoDAO) {
        this.historicoDAO = historicoDAO;
    }

    public List<FilaCompleteGridDTO> findAll() {

//        return StreamSupport.stream(
//                historicoDAO.findAll()
//                        .spliterator(), false )
//                .map( FilaConverter::toCompleteGridDTO )
//                .collect( Collectors.toList() );
        return null;
    }

    public FilaCompleteGridDTO findById(Long id){
//        Fila fila = historicoDAO.findById( id )
//                .orElseThrow( () -> new EntityNotFoundException( "Fila não encontrada" ) );
//
//        return FilaConverter.toCompleteGridDTO( fila );
        return null;
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
