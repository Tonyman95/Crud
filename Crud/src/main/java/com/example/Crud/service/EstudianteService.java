package com.example.Crud.service;

import com.example.Crud.entity.Estudiante;
import com.example.Crud.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiante(){
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiante(Long id){
        return estudianteRepository.findById(id);
    }

    public void saveOrUpdate(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public void delete(Long id){
        estudianteRepository.deleteById(id);
    }
}
