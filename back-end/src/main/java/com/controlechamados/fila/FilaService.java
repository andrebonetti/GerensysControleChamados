package com.controlechamados.fila;

import com.controlechamados.fila.dto.FilaCompleteGridDTO;
import com.controlechamados.fila.dto.FilaFormAtualizacaoDTO;
import com.controlechamados.fila.dto.FilaFormCriacaoDTO;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class FilaService extends EntityService{

    private final FilaRepository filaDAO;

    public FilaService(HistoricoService historicoService
            , FilaRepository filaDAO) {
        super( historicoService
                , TabelaEnum.USUARIO
                , filaDAO);
        this.filaDAO = filaDAO;
    }

    public List<FilaCompleteGridDTO> findAll() {

        return StreamSupport.stream(
                filaDAO.findAll()
                .spliterator(), false )
            .map( FilaConverter::toCompleteGridDTO )
            .collect( Collectors.toList() );

    }

    public FilaCompleteGridDTO findById(Long id){
        Fila fila = filaDAO.findById( id )
                .orElseThrow( () -> new EntityNotFoundException( "Fila não encontrada" ) );

        return FilaConverter.toCompleteGridDTO( fila );
    }

    public void criar(FilaFormCriacaoDTO formCriacaoDTO){

        Fila fila = FilaConverter.toEntity( formCriacaoDTO );

        save(fila,AcaoEnum.CRIACAO);
    }

    public void atualizar(FilaFormAtualizacaoDTO filaFormAtualizacaoDTO){

        filaDAO.findById(filaFormAtualizacaoDTO.getId()).stream()
            .findFirst()
            .ifPresent( fila -> {
                FilaConverter.toEntity(fila, filaFormAtualizacaoDTO);
                save(fila,AcaoEnum.ATUALIZACAO);
            });
    }

    public void inativar(Long id){
        filaDAO.findById(id).stream()
        .findFirst()
        .ifPresent( fila -> {
            save(fila,AcaoEnum.INATIVACAO);
        });
    }

}
