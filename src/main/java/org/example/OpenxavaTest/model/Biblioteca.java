package org.example.OpenxavaTest.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;
import org.openxava.model.Identifiable;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Collection;

@Getter
@Setter
@Entity
public class Biblioteca extends Identifiable {

    private String nombre;

    @ElementCollection
    @ListProperties("nombreBarrio,direccion,municipio.nombre")
    private Collection<Libro> libro;

}
