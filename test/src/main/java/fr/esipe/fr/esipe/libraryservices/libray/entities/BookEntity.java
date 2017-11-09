package fr.esipe.fr.esipe.libraryservices.libray.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Warren D'ALMEIDA
 */
@Data
@Entity(name = "book")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title")
	private double title;

	@Column(name = "cat")
	private String cat;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "id_exm")
	private ExemplaryEntity exm;
}