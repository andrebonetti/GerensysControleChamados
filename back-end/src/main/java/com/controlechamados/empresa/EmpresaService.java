package com.controlechamados.empresa;

import com.controlechamados.empresa.dto.EmpresaFormAtualizacaoDTO;
import com.controlechamados.empresa.dto.EmpresaFormCriacaoDTO;
import com.controlechamados.empresa.dto.EmpresaGridDTO;
import com.controlechamados.historico.HistoricoService;
import com.controlechamados.historico.dto.HistoricoParam;
import com.controlechamados.historico.enums.AcaoEnum;
import com.controlechamados.historico.enums.TabelaEnum;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmpresaService {

    private HistoricoService historicoService;

    public EmpresaService(HistoricoService historicoService) {
        this.historicoService = historicoService;
    }

    public List<EmpresaGridDTO> findAll() {
        List<Empresa> empresas = EmpresaMock.empresaCases();
        List<EmpresaGridDTO> empresaGridDTOS = empresas.stream()
                .map( EmpresaConverter::toGridDTO )
                .collect( Collectors.toList() );

        return empresaGridDTOS;
    }

    public EmpresaGridDTO findById(String id){
        Empresa empresa = EmpresaMock.empresaCase1();
        EmpresaGridDTO empresaGridDTO = EmpresaConverter.toGridDTO( empresa );

        return empresaGridDTO;
    }

    public void criar(EmpresaFormCriacaoDTO empresaFormCriacaoDTO){

        Empresa empresa = new Empresa( empresaFormCriacaoDTO );

        historicoService.criarHistoricoRegistro( new HistoricoParam(
            TabelaEnum.EMPRESA,
            AcaoEnum.CRIACAO,
            empresa.getId(),
            empresa.toString()
        ));

    }

    public void atualizar(EmpresaFormAtualizacaoDTO empresaFormAtualizacaoDTO){

        Empresa empresa = EmpresaMock.empresaCase1();

        empresa.atualizar( empresaFormAtualizacaoDTO );

        historicoService.criarHistoricoRegistro( new HistoricoParam(
            TabelaEnum.EMPRESA,
            AcaoEnum.ALTERACAO,
            empresa.getId(),
            empresa.toString()
        ));

    }

    public void inativar(UUID id){

        Empresa empresa = EmpresaMock.empresaCase1();

//        empresa.atualizar( empresaFormAtualizacaoDTO );
//
//        historicoService.criarHistoricoRegistro( new HistoricoParam(
//                TabelaEnum.EMPRESA,
//                AcaoEnum.ALTERACAO,
//                empresa.getId(),
//                empresa.toString()
//        ));

    }

}
