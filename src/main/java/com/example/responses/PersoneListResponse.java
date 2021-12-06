package com.example.responses;

import java.util.List;

import com.example.entities.Persona;

public class PersoneListResponse {
	private List<Persona> persone;

	public List<Persona> getPersone() {
		return persone;
	}

	public void setPersone(List<Persona> persone) {
		this.persone = persone;
	}
}
