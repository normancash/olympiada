package org.example.OpenxavaTest.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;

import javax.persistence.ElementCollection;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;

@Getter
@Setter
public class Prestamo {
    private LocalDate fechaPrestamo;

    @ManyToone
    private Estudiante estudiante;


    @ElementCollection
    @ListProperties("nombreBarrio,direccion,municipio.nombre")
    private Collection<Libro> libro;


}
