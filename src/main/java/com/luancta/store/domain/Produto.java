package com.luancta.store.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Produto implements Serializable {

	public Produto( String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double preco;
	
	@JsonBackReference //XXX: @JsonBackReference indica que a busca será realizada pelo outro lado do mapeamento categoria.getprodutos() 
	@ManyToMany
	@JoinTable(name = "produto_categoria", 
		joinColumns = @JoinColumn(name = "id_produto"),
		inverseJoinColumns = @JoinColumn(name = "id_categoria")
	)
	private List<Categoria> categorias = new ArrayList<>();

}