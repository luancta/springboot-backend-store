package com.luancta.store.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luancta.store.domain.Categoria;
import com.luancta.store.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")//aqui é nome do endpoint, vamos utilizar categorias pela convenção padrão
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		//NOTA: @pathVariable mapeia o parametro da URL /{id} na variavel id Integer
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
