package com.odcarebears.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="detalles_pedido")

public class DetallesPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="detalle_id")//llave compuesta(pedido id/detalle id)
	private Long idDetalle;
	@Column(name="cantidad_producto")
	private Integer cantidadProducto;
	@Column(name="importe_total")
	private Double importeTotal;
	
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto idProducto;
	
	
	@ManyToOne
	@JoinColumn(name="id_pedido")
	private Pedido idPedido;


	public Long getIdDetalle() {
		return idDetalle;
	}


	public void setIdDetalle(Long idDetalle) {
		this.idDetalle = idDetalle;
	}


	public Integer getCantidadProducto() {
		return cantidadProducto;
	}


	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}


	public Double getImporteTotal() {
		return importeTotal;
	}


	public void setImporteTotal(Double importeTotal) {
		this.importeTotal = importeTotal;
	}


	public Producto getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}


	public Pedido getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(Pedido idPedido) {
		this.idPedido = idPedido;
	}

	 
	
}



