package com.ud25_Cine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud25_Cine.dto.Peliculas;

public interface IPeliculasDAO extends JpaRepository<Peliculas,Integer>{

}