package com.controlechamados.historico;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HistoricoRepository extends CrudRepository<Historico, Long> {

    List<Historico> findByIdRegistro(Long Id);

}
