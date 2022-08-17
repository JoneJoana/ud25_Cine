package com.ud25_Cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud25_Cine.dto.Peliculas;
import com.ud25_Cine.dao.IPeliculasDAO;

@Service
public class PeliculasServiceImpl implements IPeliculasService{

	@Autowired
	IPeliculasDAO iPeliDao;
	
	@Override
	public List<Peliculas> listPeliculas() {
		return iPeliDao.findAll();
	}

	@Override
	public Peliculas savePeliculas(Peliculas pelicula) {
		return iPeliDao.save(pelicula);
	}

	@Override
	public void deletePeliculas(int id) {
		iPeliDao.deleteById(id);
	}

	@Override
	public Peliculas findById(int id) {
		return iPeliDao.findById(id).get();
	}

}
