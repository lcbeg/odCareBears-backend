package com.odcarebears.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.odcarebears.entity.Producto;
import com.odcarebears.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
@CrossOrigin(origins="*")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@GetMapping //localhost:8080/invisible/categoria/
    @ResponseBody 
    //ResponseEntity configura la respuesta http
    public  ResponseEntity<?> getAllProducto () {
        try {
            return new ResponseEntity<Iterable<Producto>>
            (productoService.findAllProductos(), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
            }
        }

        
	@GetMapping("/{id}") //localhost:8080/api/customer/id
    @ResponseBody
    public ResponseEntity<?> getProductoById(@PathVariable("id") Long id) {
        try {
            return new ResponseEntity<Producto>( 
                            productoService.findProductoById(id),
                            HttpStatus.OK);
        }
        catch (IllegalStateException e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
        catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
}
	
	@GetMapping("/categoria/{id_categoria}") //localhost:8080/api/customer/id
    @ResponseBody
    public ResponseEntity<?> getProductoByCategoria(@PathVariable("id_categoria") Long id) {
        try {
            return new ResponseEntity<Iterable<Producto>>( 
                            productoService.findProductosByCategoria(id),
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
