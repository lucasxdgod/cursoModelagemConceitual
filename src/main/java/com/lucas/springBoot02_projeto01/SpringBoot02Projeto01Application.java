package com.lucas.springBoot02_projeto01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.springBoot02_projeto01.domain.Categoria;
import com.lucas.springBoot02_projeto01.repositoreis.CategoriaRepository;

@SpringBootApplication
public class SpringBoot02Projeto01Application implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Projeto01Application.class, args);
	}
	
	
	@Override
	public void run(String...strings) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	

}
