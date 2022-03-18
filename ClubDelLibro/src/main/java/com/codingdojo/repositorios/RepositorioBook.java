package com.codingdojo.repositorios;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.modelos.Book;

@Repository
public interface RepositorioBook extends CrudRepository<Book,Long>{
	
	List<Book>findAll();
	
	@SuppressWarnings("unchecked")
	Book save(Book nuevoBook); 
	
	//aqui se me fue el internet
	List<Book> findById(long id);
	
	
	
}
