package com.controlechamados.usuario.perfil;

import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.Usuario;
import com.controlechamados.usuario.UsuarioConverter;
import com.controlechamados.usuario.UsuarioMock;
import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormAtualizacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormCriacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PerfilService extends EntityService{

    private final PerfilRepository perfilDAO;

    @Autowired
    public PerfilService(HistoricoService historicoService, PerfilRepository perfilDAO) {
        super( historicoService, TabelaEnum.PERFIL );
        this.perfilDAO = perfilDAO;
    }

    public List<PerfilGridDTO> findAll() {

        return StreamSupport.stream(
                perfilDAO.findAll()
                .spliterator(), false )
            .map( PerfilConverter::toCompleteGridDTO )
            .collect( Collectors.toList() );

    }

    public PerfilGridDTO findById(String id){

        Optional<Perfil> perfil = perfilDAO.findById( UUID.fromString( id ) );

        return null;

    }

    public void criar(PerfilFormCriacaoDTO perfilFormCriacaoDTO){

        Perfil perfil = PerfilConverter.toEntity( perfilFormCriacaoDTO );

        perfilDAO.save( perfil );
//TODO  RETURN save(usuario,AcaoEnum.CRIACAO);
    }

    public void atualizar(PerfilFormAtualizacaoDTO perfilFormAtualizacaoDTO){

        perfilDAO.findById(
            UUID.fromString(perfilFormAtualizacaoDTO.getId())).stream()
            .findFirst()
            .ifPresent( perfil -> {
                PerfilConverter.toEntity( perfil, perfilFormAtualizacaoDTO );
                perfilDAO.save( perfil );
                //TODO RETURN save(usuario,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(UUID id){
        perfilDAO.findById(id).stream()
        .findFirst()
        .ifPresent( usuario -> {
            perfilDAO.save( usuario );
            //TODO RETURN save(usuario,AcaoEnum.INATIVACAO);
        });
    }

}
