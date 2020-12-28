package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaCompleteGridDTO;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.models.EntityService;
import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmpresaService extends EntityService{

    private final EmpresaRepository empresaDAO;

    public EmpresaService(HistoricoService historicoService, EmpresaRepository empresaDAO) {
        super( historicoService, TabelaEnum.EMPRESA, empresaDAO );
        this.empresaDAO = empresaDAO;
    }

    public List<EmpresaCompleteGridDTO> findAll() {
        List<Empresa> empresas = StreamSupport
                .stream(empresaDAO.findAll().spliterator(), false)
                .collect(Collectors.toList());

        List<EmpresaCompleteGridDTO> empresaCompleteGridDTOS = empresas.stream()
                .map( EmpresaConverter::toCompleteGridDTO )
                .collect( Collectors.toList() );

        return empresaCompleteGridDTOS;
    }

    public EmpresaCompleteGridDTO findById(String id){
        Empresa empresa = EmpresaMock.empresaCase1();
        EmpresaCompleteGridDTO empresaCompleteGridDTO = EmpresaConverter.toCompleteGridDTO( empresa );

        return empresaCompleteGridDTO;
    }

    public void criar(EmpresaFormCriacaoDTO empresaFormCriacaoDTO){

        Empresa empresa = EmpresaConverter.toEntity( empresaFormCriacaoDTO );

        save(empresa,AcaoEnum.CRIACAO);
    }

    public void atualizar(EmpresaFormAtualizacaoDTO empresaFormAtualizacaoDTO){

        Empresa empresa = EmpresaMock.empresaCase1();
        EmpresaConverter.toEntity(empresa, empresaFormAtualizacaoDTO );

        save(empresa,AcaoEnum.ATUALIZACAO);
    }

    public void inativar(UUID id){
        Empresa empresa = EmpresaMock.empresaCase1();

        save( empresa,AcaoEnum.INATIVACAO );
    }

}
