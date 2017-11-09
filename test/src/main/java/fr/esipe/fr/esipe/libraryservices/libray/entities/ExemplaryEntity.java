package fr.esipe.fr.esipe.libraryservices.libray.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "exemp")
public class ExemplaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_book")
    private BookEntity bookEntity;
}

