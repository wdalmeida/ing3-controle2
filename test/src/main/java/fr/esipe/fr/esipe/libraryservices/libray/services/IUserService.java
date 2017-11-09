package fr.esipe.fr.esipe.libraryservices.libray.services;


import fr.esipe.fr.esipe.libraryservices.libray.models.UserDto;

import java.util.List;
import java.util.Optional;

/**
 * @author Warren D'ALMEIDA
 */

public interface IUserService {

	List<UserDto> getAll();

	Optional<UserDto> getUserById(String id);

	UserDto create(UserDto userDto);

	void delete(String id);

	void update(String id, UserDto userDto);
}
