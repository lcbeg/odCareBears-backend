package com.odcarebears.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.odcarebears.entity.Usuario;
import com.odcarebears.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins="*")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/{email}") //localhost:8080/api/usuario/email
    @ResponseBody
    public ResponseEntity<?> getUsuarioByEmail(@PathVariable("email") String email) {
        try {
            return new ResponseEntity<Usuario>( 
                            usuarioService.findUsuarioByEmail(email),
                            HttpStatus.OK);
        }
        catch (IllegalStateException e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
}
}
