package com.odcarebears.entity;


import javax.persistence.*;

@Entity
@Table(name="categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Long idCategoria;
	
	@Column(name="nombre_categoria", length=100)
	private String nombreCategoria;
	
	@Column(name="imagen_categoria", length=155)
	private String imagenCategoria;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public String getImagenCategoria() {
		return imagenCategoria;
	}

	public void setImagenCategoria(String imagenCategoria) {
		this.imagenCategoria = imagenCategoria;
	}
	
}


	