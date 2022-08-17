package com.ud25_Cine.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="peliculas")
public class Peliculas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private int calif_edad;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pelicula") //mappedBy la variable de Salas que hace ref a peliculas
	private List<Salas> salas;
	
	public Peliculas() {}

	public Peliculas(int id, String nombre, int calif_edad) {
		this.id = id;
		this.nombre = nombre;
		this.calif_edad = calif_edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCalif_edad() {
		return calif_edad;
	}

	public void setCalif_edad(int calif_edad) {
		this.calif_edad = calif_edad;
	}

	public List<Salas> getSalas() {
		return salas;
	}

	public void setSalas(List<Salas> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Peliculas [id=" + id + ", nombre=" + nombre + ", calif_edad=" + calif_edad + "]";
	}
	
}
