package com.controlechamados.usuario;

import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
import com.controlechamados.usuario.dto.UsuarioReferenceDTO;
import com.controlechamados.usuario.perfil.Perfil;
import com.controlechamados.usuario.perfil.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UsuarioService extends EntityService{

    @Autowired
    private final UsuarioRepository usuarioDAO;

    @Autowired
    private final PerfilRepository perfilDAO;

    @Autowired
    public UsuarioService( UsuarioRepository usuarioDAO
            , PerfilRepository perfilDAO) {
        super( TabelaEnum.USUARIO
                , usuarioDAO);
        this.usuarioDAO = usuarioDAO;
        this.perfilDAO = perfilDAO;
    }

    public List<UsuarioCompleteGridDTO> findAll() {

        return StreamSupport.stream(
                usuarioDAO.findAll()
                .spliterator(), false )
            .map( UsuarioConverter::toCompleteGridDto )
            .collect( Collectors.toList() );

    }

    public UsuarioCompleteGridDTO findById(Long id){
        Usuario usuario = usuarioDAO.findById( id )
                .orElseThrow( () -> new EntityNotFoundException( "Usuario não encontrado" ) );

        return UsuarioConverter.toCompleteGridDto( usuario );
    }

    public void criar(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO){

        Usuario usuario = UsuarioConverter.toEntity( usuarioFormCriacaoDTO
                , findReferences( usuarioFormCriacaoDTO ) );

        usuarioDAO.save( usuario );
//TODO  RETURN save(usuario,AcaoEnum.CRIACAO);
    }

    public void atualizar(UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO){

        usuarioDAO.findById(usuarioFormAtualizacaoDTO.getId()).stream()
            .findFirst()
            .ifPresent( usuario -> {
                UsuarioConverter.toEntity( usuario
                        , usuarioFormAtualizacaoDTO
                        , findReferences( usuarioFormAtualizacaoDTO ));
                usuarioDAO.save( usuario );
                //TODO RETURN save(usuario,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(Long id){
        usuarioDAO.findById(id).stream()
        .findFirst()
        .ifPresent( usuario -> {
            save(usuario,AcaoEnum.INATIVACAO);
        });
    }

    private UsuarioReferenceDTO findReferences(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO){

        Perfil perfil = this.perfilDAO.findById( usuarioFormCriacaoDTO.getIdPerfil() )
                .orElseThrow( () -> new EntityNotFoundException( "Perfil não encontrado" ) );

        return new UsuarioReferenceDTO(perfil);
    }

    private UsuarioReferenceDTO findReferences(UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO){

        Perfil perfil = this.perfilDAO.findById( usuarioFormAtualizacaoDTO.getIdPerfil() )
                .orElseThrow( () -> new EntityNotFoundException( "Perfil não encontrado" ) );

        return new UsuarioReferenceDTO(perfil);
    }

}
