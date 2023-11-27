package com.tomas.biblioteca.Biblioteca.model;

import com.tomas.biblioteca.Biblioteca.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autores")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Autor(AutorDTO autorDTO) {
        this.id = autorDTO.getId();
        this.nombres = autorDTO.getNombres();
        this.apellidos = autorDTO.getApellidos();
        this.telefono = autorDTO.getTelefono();
    }

    //@OneToMany(mappedBy = "autor") el one to many es el que recibe la referencia creada en el many to one
    //List<Libro> libros;
}
