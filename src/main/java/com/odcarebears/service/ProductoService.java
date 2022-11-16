package com.odcarebears.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odcarebears.entity.Producto;
import com.odcarebears.repository.ProductoRepository;
@Service
public class ProductoService {
	@Autowired
    ProductoRepository productoRepository;
	
	public List<Producto> findAllProductos() throws Exception {
		
        List<Producto> productos = (List<Producto>) productoRepository.findAll();
        return productos;
    }

    public Producto findProductoById(Long id) throws Exception {
        return productoRepository.findById(id)
                .orElseThrow(() -> 
                new IllegalStateException
                ("The product with id " + id + " does not exist, menso"));
    }
    
    public List<Producto> findProductosByCategoria(Long id_categoria) throws Exception {
    	
    	List<Producto> productos = (List<Producto>) productoRepository.findByIdCategoria(id_categoria);
    	return productos;
    }

}
