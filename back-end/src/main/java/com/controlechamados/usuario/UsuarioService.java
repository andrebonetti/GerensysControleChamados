package com.controlechamados.usuario;

import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.dto.UsuarioCompleteGridDTO;
import com.controlechamados.usuario.dto.UsuarioFormAtualizacaoDTO;
import com.controlechamados.usuario.dto.UsuarioFormCriacaoDTO;
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

    private final UsuarioRepository usuarioDAO;
    private final PerfilRepository perfilDAO;

    @Autowired
    public UsuarioService(HistoricoService historicoService
            , UsuarioRepository usuarioDAO
            , PerfilRepository perfilDAO) {
        super( historicoService, TabelaEnum.USUARIO );
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
        Usuario usuario = UsuarioMock.usuarioMock();
        UsuarioCompleteGridDTO usuarioCompleteGridDTO = UsuarioConverter.toCompleteGridDto( usuario );

        return usuarioCompleteGridDTO;
    }

    public void criar(UsuarioFormCriacaoDTO usuarioFormCriacaoDTO){

        Perfil perfil = this.perfilDAO.findById( usuarioFormCriacaoDTO.getIdPerfil() )
                .orElseThrow( () -> new EntityNotFoundException( "Perfil não encontrado" ) );

        Usuario usuario = UsuarioConverter.toEntity( usuarioFormCriacaoDTO, perfil );

        usuarioDAO.save( usuario );
//TODO  RETURN save(usuario,AcaoEnum.CRIACAO);
    }

    public void atualizar(UsuarioFormAtualizacaoDTO usuarioFormAtualizacaoDTO){

        usuarioDAO.findById(usuarioFormAtualizacaoDTO.getId()).stream()
            .findFirst()
            .ifPresent( usuario -> {
                UsuarioConverter.toEntity( usuario, usuarioFormAtualizacaoDTO );
                usuarioDAO.save( usuario );
                //TODO RETURN save(usuario,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(Long id){
        usuarioDAO.findById(id).stream()
        .findFirst()
        .ifPresent( usuario -> {
            usuarioDAO.save( usuario );
            //TODO RETURN save(usuario,AcaoEnum.INATIVACAO);
        });
    }

}
