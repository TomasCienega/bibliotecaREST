package com.tomas.biblioteca.Biblioteca.service;

import com.tomas.biblioteca.Biblioteca.dto.AutorDTO;
import com.tomas.biblioteca.Biblioteca.dto.LibroDTO;
import com.tomas.biblioteca.Biblioteca.model.Autor;
import com.tomas.biblioteca.Biblioteca.repository.AutorRepository;
import com.tomas.biblioteca.Biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private FabricaLibroService fabricaLibroService;
    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private FabricaAutorService fabricaAutorService;
    public LibroDTO save(LibroDTO libroDTO){
        // buscar autor
        Autor autor = autorRepository.findById(libroDTO.getIdAutor()).get();
        libroDTO.setAutorDto(fabricaAutorService.crearAutorDTO(autor));
        return  fabricaLibroService.crearLibroDTO(libroRepository.save(fabricaLibroService.crearLibro(libroDTO)));
    }
    public List<LibroDTO> findAll(){
        return fabricaLibroService.crearLibrosDTO(libroRepository.findAll());
    }
    public LibroDTO findById(Integer id){
        return fabricaLibroService.crearLibroDTO(libroRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        libroRepository.deleteById(id);
    }
}
