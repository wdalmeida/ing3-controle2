package fr.esipe.fr.esipe.libraryservices.libray.services;

import fr.esipe.fr.esipe.libraryservices.libray.models.BookDto;

/**
 * @author Warren D'ALMEIDA
 */

public interface IBookService {
	BookDto create(BookDto accountDto);
}
