package com.ud25_Cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud25_Cine.dto.Peliculas;
import com.ud25_Cine.service.PeliculasServiceImpl;


@RestController
@RequestMapping("/api")
public class PeliculasController {

	@Autowired
	PeliculasServiceImpl peliServImpl;
	
	@GetMapping("/peliculas")
	public List<Peliculas> listPeliculas(){
		return peliServImpl.listPeliculas();
	}
		
	@GetMapping("/peliculas/{id}")
	public Peliculas findById(@PathVariable(name="id") int id) {
		return peliServImpl.findById(id);
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void deletePeliculas(@PathVariable(name="id") int id) {
		peliServImpl.deletePeliculas(id);
	}
	
	@PostMapping("/peliculas")
	public Peliculas savePeliculas(@RequestBody Peliculas pelicula) {
		return peliServImpl.savePeliculas(pelicula);
	}
	
	@PutMapping("/peliculas/{id}") //actualizar
	public Peliculas updatePeliculas(@PathVariable(name="id") int id, @RequestBody Peliculas pelicula) {
		Peliculas peli_selec = peliServImpl.findById(id);
		
		peli_selec.setNombre(pelicula.getNombre());
		peli_selec.setCalif_edad(pelicula.getCalif_edad());
				
		return peliServImpl.savePeliculas(peli_selec);
	}
}
