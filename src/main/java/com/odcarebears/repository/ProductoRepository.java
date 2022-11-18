package com.odcarebears.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.odcarebears.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
		List <Producto> findByIdCategoria(Long id_Categoria);
			
		
}
