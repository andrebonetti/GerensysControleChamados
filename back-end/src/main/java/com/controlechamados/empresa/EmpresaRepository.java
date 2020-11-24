package com.controlechamados.empresa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface EmpresaRepository extends CrudRepository<Empresa, UUID> {

    List<Empresa> findByRazaoSocial(String razaoSocial);

}
