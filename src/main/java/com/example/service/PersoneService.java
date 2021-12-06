package com.example.service;

import java.util.List;

import com.example.entities.Persona;

public interface PersoneService {
	Persona getOne(Integer id);

	List<Persona> getAll();

	void insertOne(Persona persona);

	void updateOne(Persona persona);

	void deleteOne(Integer id);

}
