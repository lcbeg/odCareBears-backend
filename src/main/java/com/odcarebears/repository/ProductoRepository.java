package com.odcarebears.repository;

import org.springframework.data.repository.CrudRepository;

import com.odcarebears.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
		Iterable<Producto> findByIdCategoria(Long id_Categoria);
			
		
}
