package com.tomas.biblioteca.Biblioteca.dto;

import com.tomas.biblioteca.Biblioteca.model.Autor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutorDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String telefono;

    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombres = autor.getNombres();
        this.apellidos = autor.getApellidos();
        this.telefono = autor.getTelefono();
    }
}
