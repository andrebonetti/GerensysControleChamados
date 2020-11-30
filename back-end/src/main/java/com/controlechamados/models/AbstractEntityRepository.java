package com.controlechamados.models;

import com.controlechamados.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface AbstractEntityRepository extends CrudRepository<AbstractEntity, Long> {

}
