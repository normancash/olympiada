package org.example.OpenxavaTest.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.model.Identifiable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Libro extends Identifiable {

    private String nombre;

    private LocalDate fechaPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties = "nombre,apellido,nombrecompleto")
    private Autor autor;
}
