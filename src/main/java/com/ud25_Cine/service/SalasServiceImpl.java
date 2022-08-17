package com.ud25_Cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_Cine.dao.ISalasDAO;
import com.ud25_Cine.dto.Salas;

@Service
public class SalasServiceImpl implements ISalasService{

	@Autowired
	ISalasDAO iSalasDao;
	
	@Override
	public List<Salas> listSalas() {
		return iSalasDao.findAll();
	}

	@Override
	public Salas saveSala(Salas sala) {
		return iSalasDao.save(sala);
	}

	@Override
	public void deleteSala(int id) {
		iSalasDao.deleteById(id);
		
	}

	@Override
	public Salas findById(int id) {
		return iSalasDao.findById(id).get();
	}

}
