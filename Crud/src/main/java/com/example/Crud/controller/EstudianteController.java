package com.example.Crud.controller;

import com.example.Crud.entity.Estudiante;
import com.example.Crud.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> getAll(){
        return estudianteService.getEstudiante();
    }

    @GetMapping("/{estudianteId}")
    public Optional<Estudiante> getById(@PathVariable("estudianteId") Long estudianteId){
        return estudianteService.getEstudiante(estudianteId);

    }

    @PostMapping
    public String saveUpdate (@RequestBody Estudiante estudiante){
        estudianteService.saveOrUpdate(estudiante);
        return "Usuario ingresado";
    }

    @DeleteMapping("/{estudianteId}")
    public String delete (@PathVariable("estudianteId") Long estudianteId){
        estudianteService.delete(estudianteId);
        return "Usuario eliminado";
    }
}
