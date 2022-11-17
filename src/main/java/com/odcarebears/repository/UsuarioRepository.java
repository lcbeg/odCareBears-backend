package com.odcarebears.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.odcarebears.entity.*;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail(String email);
}
