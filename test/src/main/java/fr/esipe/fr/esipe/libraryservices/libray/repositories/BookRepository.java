package fr.esipe.fr.esipe.libraryservices.libray.repositories;

import fr.esipe.fr.esipe.libraryservices.libray.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Warren D'ALMEIDA
 */
public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
