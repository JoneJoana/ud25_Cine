package com.ud25_Cine.service;

import java.util.List;

import com.ud25_Cine.dto.Salas;

public interface ISalasService {
	
	//CRUD
	public List<Salas> listSalas();
	
	public Salas saveSala(Salas sala); 
	
	public void deleteSala(int id);
	
	public Salas findById(int id);

}
