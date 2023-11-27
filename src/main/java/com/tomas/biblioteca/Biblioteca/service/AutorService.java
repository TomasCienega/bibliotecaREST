package com.tomas.biblioteca.Biblioteca.service;

import com.tomas.biblioteca.Biblioteca.dto.AutorDTO;
import com.tomas.biblioteca.Biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    //inyecta la clase a AutorService con el Autowired
    @Autowired
    private FabricaAutorService fabricaAutorService;
    @Autowired
    private AutorRepository autorRepository;
    public AutorDTO save(AutorDTO autorDTO){
        return  fabricaAutorService.crearAutorDTO(autorRepository.save(fabricaAutorService.crearAutor(autorDTO)));
    }
    public List<AutorDTO> findAll(){
        return fabricaAutorService.crearAutoresDTO(autorRepository.findAll());
    }
    public AutorDTO findById(Integer id){
        return fabricaAutorService.crearAutorDTO(autorRepository.findById(id).get());
    }

    public void deleteById(Integer id){
        autorRepository.deleteById(id);
    }
}
