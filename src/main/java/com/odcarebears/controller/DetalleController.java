package com.odcarebears.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.odcarebears.entity.DetallesPedido;
import com.odcarebears.service.DetallesPedidoService;

@RestController
@RequestMapping("/api/detalles/")
@CrossOrigin(origins="*")
public class DetalleController {
	
	@Autowired
	DetallesPedidoService detalleService;

	@PostMapping 
	@ResponseBody
	public ResponseEntity<?> addNewDetalle(@RequestBody DetallesPedido pedido) {
		try {
			//return new ResponseEntity<String>("no funciona", HttpStatus.ACCEPTED);
			return new ResponseEntity<DetallesPedido>(detalleService.saveDetalles(pedido), HttpStatus.CREATED);
		}
		catch (IllegalStateException e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
					
	}
}
