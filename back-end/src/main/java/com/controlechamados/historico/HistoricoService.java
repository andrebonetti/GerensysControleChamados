package com.controlechamados.historico;

import com.controlechamados.historico.dto.HistoricoGridDTO;
import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioMock;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class HistoricoService {

    private final HistoricoRepository historicoDAO;

    public HistoricoService(HistoricoRepository historicoDAO) {
        this.historicoDAO = historicoDAO;
    }

    public List<HistoricoGridDTO> findAll() {

        return StreamSupport.stream(
                historicoDAO.findAll()
                        .spliterator(), false )
                .map( HistoricoConverter::toGridDTO )
                .collect( Collectors.toList() );
    }

    public HistoricoGridDTO findById(Long id){
        Historico historico = historicoDAO.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Historico não encontrado"));

        return HistoricoConverter.toGridDTO( historico );
    }

    public List<HistoricoGridDTO> findRegistroById(Long id) {

        return StreamSupport.stream(
                historicoDAO.findAll()
                        .spliterator(), false )
                .map( HistoricoConverter::toGridDTO )
                .collect( Collectors.toList() );
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
