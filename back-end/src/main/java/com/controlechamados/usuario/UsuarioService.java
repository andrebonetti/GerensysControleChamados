package com.controlechamados.usuario;

import com.controlechamados.empresa.Empresa;
import com.controlechamados.empresa.EmpresaConverter;
import com.controlechamados.empresa.EmpresaMock;
import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UsuarioService extends EntityService{

    private final UsuarioRepository usuarioDAO;

    @Autowired
    public UsuarioService(HistoricoService historicoService, UsuarioRepository usuarioDAO) {
        super( historicoService, TabelaEnum.USUARIO );
        this.usuarioDAO = usuarioDAO;
    }

    public List<UsuarioCompleteGridDTO> findAll() {

        return StreamSupport.stream(
                usuarioDAO.findAll()
                .spliterator(), false )
            .map( UsuarioConverter::toCompleteGridDto )
            .collect( Collectors.toList() );

    }

    public UsuarioCompleteGridDTO findById(String id){
        Usuario usuario = UsuarioMock.usuarioMock();
        UsuarioCompleteGridDTO usuarioCompleteGridDTO = UsuarioConverter.toCompleteGridDto( usuario );

        return usuarioCompleteGridDTO;
    }

    public void criar(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO){

        Usuario usuario = UsuarioConverter.toEntity( usuarioFormCriacaoDTO );

        usuarioDAO.save( usuario );
//TODO  RETURN save(usuario,AcaoEnum.CRIACAO);
    }

    public void atualizar(UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO){

        usuarioDAO.findById(
            UUID.fromString(usuarioFormAtualizacaoDTO.getId())).stream()
            .findFirst()
            .ifPresent( usuario -> {
                UsuarioConverter.toEntity( usuario, usuarioFormAtualizacaoDTO );
                usuarioDAO.save( usuario );
                //TODO RETURN save(usuario,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(UUID id){
        usuarioDAO.findById(id).stream()
        .findFirst()
        .ifPresent( usuario -> {
            usuarioDAO.save( usuario );
            //TODO RETURN save(usuario,AcaoEnum.INATIVACAO);
        });
    }

}
