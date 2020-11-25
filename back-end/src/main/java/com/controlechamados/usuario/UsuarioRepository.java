package com.controlechamados.usuario;

import com.controlechamados.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UsuarioRepository extends CrudRepository<Usuario, UUID> {

}
