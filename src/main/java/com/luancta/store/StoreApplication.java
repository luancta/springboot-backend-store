package com.luancta.store;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luancta.store.domain.Cidade;
import com.luancta.store.domain.Estado;
import com.luancta.store.repositories.CategoriaRepository;
import com.luancta.store.repositories.CidadeRepository;
import com.luancta.store.repositories.EstadoRepository;
import com.luancta.store.repositories.ProdutoRepository;

@SpringBootApplication
public class StoreApplication  implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {

		/* Bloco já executado
		Categoria cat1 = new Categoria(1,"Informática");
		Categoria cat2 = new Categoria(2,"Escritório");
		
		Produto p1 = new Produto("Computador", 2000.00);
		Produto p2 = new Produto("Impressora", 800.00);
		Produto p3 = new Produto("Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));*/
		
		/* Bloco já executado
		Estado estado =  new Estado();
		estado.setNome("Rio Grande do Norte");
		
		Cidade cidade = new Cidade();
		cidade.setNome("Natal");
		cidade.setEstado(estado);
		
		estado.getCidades().add(cidade);
		
		estadoRepository.saveAll(Arrays.asList(estado));
		cidadeRepository.saveAll(Arrays.asList(cidade));
		*/
	}
} 