package fr.esipe.fr.esipe.libraryservices.libray.controllers;

import fr.esipe.fr.esipe.libraryservices.libray.models.BookDto;
import fr.esipe.fr.esipe.libraryservices.libray.models.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Warren D'ALMEIDA
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {



	/**
	 * Get user data with the given id
	 *
	 * @param id Long
	 * @return data in JSON
	 */
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDto> get(@PathVariable Long id) {
		return	new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * Add a user into the database
	 *
	 * @param book using JSON
	 * @return user in JSON
	 */
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<UserDto> create(@RequestBody BookDto book) {
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * Modify the user phone number and address
	 *
	 * @param id String
	 * @param book using JSON
	 * @return OK
	 */
	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> update(@PathVariable String id, @RequestBody BookDto book) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
