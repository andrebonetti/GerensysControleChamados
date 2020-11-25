package com.controlechamados.empresa;

import com.controlechamados.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EmpresaRepository extends CrudRepository<Empresa, UUID> {

}
