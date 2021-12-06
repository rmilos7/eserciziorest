package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Persona;
import com.example.repository.PersoneRepository;

@Service
public class PersoneServiceImpl implements PersoneService {
	@Autowired
	private PersoneRepository repository;

	@Override
	public Persona getOne(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Persona> getAll() {
		return repository.findAll();
	}

	@Override
	public void insertOne(Persona persona) {
		repository.save(persona);
	}

	@Override
	public void updateOne(Persona persona) {
		repository.save(persona);
	}

	@Override
	public void deleteOne(Integer id) {
		repository.deleteById(id);
	}

}
