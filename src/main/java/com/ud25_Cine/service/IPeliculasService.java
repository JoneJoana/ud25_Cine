package com.ud25_Cine.service;

import java.util.List;

import com.ud25_Cine.dto.Peliculas;

public interface IPeliculasService {
	
	//CRUD
	public List<Peliculas> listPeliculas();
	
	public Peliculas savePeliculas(Peliculas pelicula); 
	
	public void deletePeliculas(int id);
	
	public Peliculas findById(int id);

}
