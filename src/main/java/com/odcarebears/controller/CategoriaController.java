package com.odcarebears.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.odcarebears.entity.Categoria;
import com.odcarebears.service.CategoriaService;

@RestController
@RequestMapping("/invisible/categoria")
@CrossOrigin(origins="*")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	
	@GetMapping //localhost:8080/invisible/categoria/
    @ResponseBody 
    //ResponseEntity configura la respuesta http
    public  ResponseEntity<?> getAllCategorias () {
        try {
            return new ResponseEntity<Iterable<Categoria>>
            (categoriaService.findAllCategorias(), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
