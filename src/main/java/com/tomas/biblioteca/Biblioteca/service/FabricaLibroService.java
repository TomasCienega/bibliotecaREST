package com.tomas.biblioteca.Biblioteca.service;

import com.tomas.biblioteca.Biblioteca.dto.LibroDTO;
import com.tomas.biblioteca.Biblioteca.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FabricaLibroService {
    public Libro crearLibro(LibroDTO libroDTO){
        return new Libro(libroDTO);
    }

    public LibroDTO crearLibroDTO(Libro libro){
        return new LibroDTO(libro);
    }

    public List<LibroDTO> crearLibrosDTO(List<Libro> libros){
        List<LibroDTO> libroDTOS = new ArrayList<>();
        libros.stream().forEach(
                libro -> {
                    libroDTOS.add(new LibroDTO(libro));
                }
        );
        return  libroDTOS;
    }
}
