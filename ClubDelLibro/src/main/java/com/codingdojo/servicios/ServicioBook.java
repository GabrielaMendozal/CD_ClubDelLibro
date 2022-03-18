package com.codingdojo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Book;
import com.codingdojo.modelos.Usuario;
import com.codingdojo.repositorios.RepositorioBook;

@Service
public class ServicioBook {
	
	private final RepositorioBook repositorioBook;

	public ServicioBook(RepositorioBook repositorioBook) {
		this.repositorioBook = repositorioBook;
	}
	
	public Book insertIntoBooks(Book nuevoBook) {
		return repositorioBook.save(nuevoBook);
	}
	
	public List<Book> selectFromAllBooks() {
		return repositorioBook.findAll();
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = repositorioBook.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}else {
			return null;
			}
	}
	// entre (edicionBook)
	 public Book updatedBook(Long id, String title, String author, String thoughts, Usuario usuario) {
			Book edicionBook = new Book(title, author, thoughts, usuario); // este objeto era el mismo de la linea de abajo //
			edicionBook.setId(id);
			return repositorioBook.save(edicionBook);
	 }
}
