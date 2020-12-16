package com.luancta.store.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categoria implements Serializable {

	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	@JsonManagedReference //XXX: @JsonManagedReference indica que produtos será retornado ao retornar categoria 
	@ManyToMany(mappedBy = "categorias")
	private List<Produto> produtos = new ArrayList<>();
}
