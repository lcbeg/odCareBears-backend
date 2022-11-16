package com.odcarebears.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odcarebears.entity.Categoria;
import com.odcarebears.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
    CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAllCategorias() throws Exception {
		
        List<Categoria> categorias = (List<Categoria>) categoriaRepository.findAll();
        return categorias;
    }
	
	
	
	
	
	
}
