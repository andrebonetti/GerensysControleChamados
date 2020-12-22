package com.controlechamados.historico;

import com.controlechamados.historico.dto.HistoricoGridDTO;
import com.controlechamados.usuario.UsuarioConverter;
import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

public class HistoricoConverter {

    public static HistoricoGridDTO toGridDTO(Historico historico){

        UsuarioSimpleGridDTO usuarioSimpleGridDTO =
                UsuarioConverter.toSimpleGridDto(historico.getUsuarioAcao());

        return HistoricoGridDTO.builder()
                .withDados(historico.getDados())
                .withIdRegistro(historico.getIdRegistro())
                .withTipoAcao(historico.getTipoAcao().getValue())
                .withVersion(historico.getVersion())
                .withDataAcao(historico.getDataAcao().toString())
                .withUsuarioAcaoGRID(usuarioSimpleGridDTO)
                .withTabela(historico.getTabela().getValue())
                .withId(historico.getId())
                .build();

    }

}
