package com.kavs.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kavs.matriculas.modelo.entidad.Profesor;
import com.kavs.matriculas.repositorio.IProfesorRepositorio;
import com.kavs.matriculas.servicios.IProfesorServicio;

@Component
@Service
public class ProfesorServicioImpl implements IProfesorServicio {

    @Autowired
    private IProfesorRepositorio repositorioProfesor;

    @Override
    public Profesor insertarProfesor(Profesor nuevoProfesor) {
        return repositorioProfesor.save(nuevoProfesor);
    }

    @Override
    public Profesor editarProfesor(Profesor idProfesor) {
    	return repositorioProfesor.findById(idProfesor).get();
    }

    @Override
    public void eliminarProfesor(int idProfesor) {
        repositorioProfesor.deleteById(idProfesor);
    }

    @Override
    public List<Profesor> listarProfesores() {
        return repositorioProfesor.findAll();
    }
}

