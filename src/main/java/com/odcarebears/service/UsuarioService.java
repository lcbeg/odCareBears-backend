package com.odcarebears.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odcarebears.entity.Usuario;
import com.odcarebears.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario findUsuarioByEmail(String email) throws Exception {
        return usuarioRepository.findByEmail(email)
                .orElseThrow(() -> 
                new IllegalStateException
                ("The user with id " + email + " does not exist, menso"));
    }
	
}
