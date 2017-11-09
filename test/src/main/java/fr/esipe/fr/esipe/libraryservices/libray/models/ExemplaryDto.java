package fr.esipe.fr.esipe.libraryservices.libray.models;

import fr.esipe.fr.esipe.libraryservices.libray.entities.BookEntity;
import lombok.Data;

import javax.persistence.*;

public class ExemplaryDto {

    private Long id;

    private BookEntity bookEntity;
}

