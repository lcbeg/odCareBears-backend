package com.odcarebears.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.odcarebears.entity.DetallesPedido;
import com.odcarebears.entity.Producto;
import com.odcarebears.service.DetallesPedidoService;

@RestController
@RequestMapping("/api/detallesproducto")
@CrossOrigin(origins="*")
public class DetallesPedidoController {
	
	@Autowired
	DetallesPedidoService dpService;
	
	@PostMapping //localhost:8080/invisible/detpedido
	@ResponseBody
	public ResponseEntity<?> addNewDPedido(@RequestBody DetallesPedido dPedido) {
		try {
			return new ResponseEntity<DetallesPedido>(dpService.saveDetalles(dPedido), HttpStatus.CREATED);

		}
		catch (IllegalStateException e){
			return new ResponseEntity<String>(/*e.getMessage()*/"Ilegal", HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			return new ResponseEntity<String>(/*e.getMessage()*/"Error", HttpStatus.BAD_REQUEST);
		}
					
	}

	@GetMapping
	@ResponseBody
	public  ResponseEntity<?> getAllDetallesPedido () {
        try {
            return new ResponseEntity<Iterable<DetallesPedido>>
            (dpService.findAllDetalles(), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
            }
        }
	
	
	

}
