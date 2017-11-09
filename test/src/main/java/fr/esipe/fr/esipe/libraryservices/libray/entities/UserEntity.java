package fr.esipe.fr.esipe.libraryservices.libray.entities;

import fr.esipe.fr.esipe.libraryservices.libray.models.ExemplaryDto;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Warren D'ALMEIDA
 */
@Data
@Entity(name = "users")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "first_name")
	private String firstName;

	@OneToMany(mappedBy = "exemp")
	private List<ExemplaryEntity> exm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<ExemplaryEntity> getExm() {
		return exm;
	}

	public void setExm(List<ExemplaryEntity> exm) {
		this.exm = exm;
	}
}