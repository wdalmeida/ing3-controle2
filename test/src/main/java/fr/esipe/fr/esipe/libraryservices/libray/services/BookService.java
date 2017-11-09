package fr.esipe.fr.esipe.libraryservices.libray.services;

import fr.esipe.fr.esipe.libraryservices.libray.models.BookDto;
import fr.esipe.fr.esipe.libraryservices.libray.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Warren D'ALMEIDA
 */
@Service
public class BookService implements IBookService {

	private final Logger logger = LoggerFactory.getLogger(BookService.class);

	private final BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	

	@Override
	public BookDto create(BookDto accountDto) {

		return accountDto;
	}
}
