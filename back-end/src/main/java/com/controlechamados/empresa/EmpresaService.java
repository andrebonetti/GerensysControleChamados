package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
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

    public List<EmpresaGridDTO> findAll() {
        List<Empresa> empresas = StreamSupport
                .stream(empresaDAO.findAll().spliterator(), false)
                .collect(Collectors.toList());

        List<EmpresaGridDTO> empresaGridDTOS = empresas.stream()
                .map( EmpresaConverter::toSimpleGridDTO )
                .collect( Collectors.toList() );

        return empresaGridDTOS;
    }

    public EmpresaGridDTO findById(String id){
        Empresa empresa = EmpresaMock.empresaCase1();
        EmpresaGridDTO empresaGridDTO = EmpresaConverter.toSimpleGridDTO( empresa );

        return empresaGridDTO;
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
