package com.luancta.store.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luancta.store.domain.Categoria;
import com.luancta.store.repositories.CategoriaRepository;
import com.luancta.store.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired //Automaticamente instância a classe
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			
		return obj.orElse(null);
	}
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				 + ", Tipo: " + Categoria.class.getName()));
	}
	
}
