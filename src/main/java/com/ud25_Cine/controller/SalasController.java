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

import com.ud25_Cine.dto.Salas;
import com.ud25_Cine.service.SalasServiceImpl;

@RestController
@RequestMapping("/api")
public class SalasController {

	@Autowired
	SalasServiceImpl salasServImpl;
	
	@GetMapping("/salas")
	public List<Salas> listSalas(){
		return salasServImpl.listSalas();
	}
		
	@GetMapping("/salas/{id}")
	public Salas findById(@PathVariable(name="id") int id) {
		return salasServImpl.findById(id);
	}
	
	@DeleteMapping("/salas/{id}")
	public void deleteSalas(@PathVariable(name="id") int id) {
		salasServImpl.deleteSala(id);
	}
	
	@PostMapping("/salas")
	public Salas saveSalas(@RequestBody Salas sala) {
		return salasServImpl.saveSala(sala);
	}
	
	@PutMapping("/salas/{id}") //actualizar
	public Salas updateSalas(@PathVariable(name="id") int id, @RequestBody Salas sala) {
		Salas sala_selec = salasServImpl.findById(id);
		
		sala_selec.setNombre(sala.getNombre());
		sala_selec.setPelicula(sala.getPelicula());
				
		return salasServImpl.saveSala(sala_selec);
	}

}
