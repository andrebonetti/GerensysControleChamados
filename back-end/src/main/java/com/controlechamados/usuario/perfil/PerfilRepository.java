package com.controlechamados.usuario.perfil;

import com.controlechamados.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PerfilRepository extends CrudRepository<Perfil, Long> {

}
