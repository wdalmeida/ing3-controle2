package fr.esipe.fr.esipe.libraryservices.libray.repositories;

import fr.esipe.fr.esipe.libraryservices.libray.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Warren D'ALMEIDA
 */
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	List<UserEntity> findAll();
}
