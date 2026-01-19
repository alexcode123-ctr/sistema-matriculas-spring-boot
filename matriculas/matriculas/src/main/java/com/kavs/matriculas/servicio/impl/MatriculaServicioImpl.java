package com.kavs.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kavs.matriculas.modelo.entidad.Matricula;
import com.kavs.matriculas.repositorio.IMatriculaRepositorio;
import com.kavs.matriculas.servicios.IMatriculasServicio;

@Service
public class MatriculaServicioImpl implements IMatriculasServicio {

    @Autowired
    private IMatriculaRepositorio repositorioMatricula;

    @Override
    public Matricula insertarMatricula(Matricula nuevaMatricula) {
        return repositorioMatricula.save(nuevaMatricula);
    }

    @Override
    public Matricula editarMatricula(Matricula idMatricula) {
        return repositorioMatricula.findById(idMatricula).get();
    }

    @Override
    public void eliminarMatricula(int idMatricula) {
        repositorioMatricula.deleteById(idMatricula);
    }

    @Override
    public List<Matricula> listarMatriculas() {
        return repositorioMatricula.findAll();
    }
}

