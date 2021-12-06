package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Persona;
import com.example.responses.PersonaResponse;
import com.example.responses.PersoneListResponse;
import com.example.responses.Status;
import com.example.service.PersoneService;

@RestController
public class PersoneController {
	@Autowired
	private PersoneService service;

	@RequestMapping(value = "/persone/{id}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<PersonaResponse> getOne(@PathVariable Integer id) {
		HttpEntity<PersonaResponse> entity;
		PersonaResponse response = new PersonaResponse();

		response.setPersona(service.getOne(id));

		entity = new HttpEntity<>(response);

		return entity;
	}

	@RequestMapping(value = "/persone", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody HttpEntity<PersoneListResponse> getAll() {
		HttpEntity<PersoneListResponse> entity;
		PersoneListResponse response = new PersoneListResponse();

		response.setPersone(service.getAll());

		entity = new HttpEntity<>(response);

		return entity;
	}

	@RequestMapping(value = "/persone", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody HttpEntity<Status> insertOne(@RequestBody Persona persona) {
		HttpEntity<Status> entity;
		Status status;

		service.insertOne(persona);
		status = new Status(0, "success");

		entity = new HttpEntity<>(status);

		return entity;
	}

	@RequestMapping(value = "/persone", method = RequestMethod.PUT, produces = "application/json")
	public @ResponseBody HttpEntity<Status> updateOne(@RequestBody Persona persona) {
		HttpEntity<Status> entity;
		Status status;

		service.updateOne(persona);
		status = new Status(0, "success");

		entity = new HttpEntity<>(status);

		return entity;
	}

	@RequestMapping(value = "/persone/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public @ResponseBody HttpEntity<Status> deleteOne(@PathVariable Integer id) {
		HttpEntity<Status> entity;
		Status status;

		service.deleteOne(id);
		status = new Status(0, "success");

		entity = new HttpEntity<>(status);

		return entity;
	}
}
