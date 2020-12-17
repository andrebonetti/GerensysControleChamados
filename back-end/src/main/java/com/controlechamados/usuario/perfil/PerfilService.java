package com.controlechamados.usuario.perfil;

import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.perfil.dto.PerfilCompleteGridDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormAtualizacaoDTO;
import com.controlechamados.usuario.perfil.dto.PerfilFormCriacaoDTO;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PerfilService extends EntityService{

    private final PerfilRepository perfilDAO;

    public PerfilService(HistoricoService historicoService, PerfilRepository perfilDAO) {
        super( historicoService, TabelaEnum.PERFIL, perfilDAO );
        this.perfilDAO = perfilDAO;
    }

    public List<PerfilCompleteGridDTO> findAll() {

        return StreamSupport.stream(
                perfilDAO.findAll()
                .spliterator(), false )
            .map( PerfilConverter::toCompleteGridDTO )
            .collect( Collectors.toList() );

    }

    public PerfilCompleteGridDTO findById(Long id){

        Perfil perfil = perfilDAO.findById( id )
                .orElseThrow( () -> new EntityNotFoundException( "Perfil não encontrado" ) );

        return PerfilConverter.toCompleteGridDTO( perfil );

    }

    public void criar(PerfilFormCriacaoDTO perfilFormCriacaoDTO){

        Perfil perfil = PerfilConverter.toEntity( perfilFormCriacaoDTO );

        perfilDAO.save( perfil );
//TODO  RETURN save(usuario,AcaoEnum.CRIACAO);
    }

    public void atualizar(PerfilFormAtualizacaoDTO perfilFormAtualizacaoDTO){

        perfilDAO.findById(perfilFormAtualizacaoDTO.getId()).stream()
            .findFirst()
            .ifPresent( perfil -> {
                PerfilConverter.toEntity( perfil, perfilFormAtualizacaoDTO );
                perfilDAO.save( perfil );
                //TODO RETURN save(usuario,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(Long id){
        perfilDAO.findById(id).stream()
        .findFirst()
        .ifPresent( usuario -> {
            perfilDAO.save( usuario );
            //TODO RETURN save(usuario,AcaoEnum.INATIVACAO);
        });
    }

}
