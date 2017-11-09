package fr.esipe.fr.esipe.libraryservices.libray.services;

import fr.esipe.fr.esipe.libraryservices.libray.entities.UserEntity;
import fr.esipe.fr.esipe.libraryservices.libray.models.UserDto;
import fr.esipe.fr.esipe.libraryservices.libray.repositories.UserRepository;
import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Warren D'ALMEIDA
 */
@Service
public class UserService implements IUserService {

	private final Logger logger = LoggerFactory.getLogger(UserService.class);

	private final UserRepository userRepository;

	private DozerBeanMapper mapper = new DozerBeanMapper();

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/**
	 *
	 *
	 * @return
	 */
	@Override
	public List<UserDto> getAll() {
		return null;
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@Override
	public Optional<UserDto> getUserById(String id) {

		return null;
	}

	/**
	 *
	 * @param userDto
	 * @return
	 */
	@Override
	public UserDto create(UserDto userDto) {
		logger.debug("Create User");
		return  null;
	}

	/**
	 *
	 * @param id
	 */
	@Override
	public void delete(String id) {

	}

	/**
	 *
	 * @param id
	 * @param userDto
	 */
	@Override
	public void update(String id, UserDto userDto) {
		logger.debug("Update User");
	}
}
