package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Persona;

public interface PersoneRepository extends JpaRepository<Persona, Integer> {

}
