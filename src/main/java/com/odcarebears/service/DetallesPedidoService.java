package com.odcarebears.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odcarebears.entity.DetallesPedido;
import com.odcarebears.repository.DetallesPedidoRepository;

@Service
public class DetallesPedidoService {
	
	@Autowired
	DetallesPedidoRepository detallePedidoRepository;
	
	public DetallesPedido saveDetalles(DetallesPedido detalle) throws Exception {
		if (detalle.getCantidadProducto()<=0)			
			throw new IllegalStateException("Invalid quantity of items.");
	return detallePedidoRepository.save(detalle);
	}
}
