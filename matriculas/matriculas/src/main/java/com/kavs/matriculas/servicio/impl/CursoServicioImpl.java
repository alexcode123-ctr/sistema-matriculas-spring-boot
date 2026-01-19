package com.kavs.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kavs.matriculas.modelo.entidad.Curso;
import com.kavs.matriculas.repositorio.ICursoRepositorio;
import com.kavs.matriculas.servicios.ICursoServicio;

@Component
@Service
public class CursoServicioImpl implements ICursoServicio {

    @Autowired
    private ICursoRepositorio repositorioCurso;

    @Override
    public Curso insertarCurso(Curso nuevoCurso) {
        return repositorioCurso.save(nuevoCurso);
    }

    @Override
    public Curso editarCurso(int idCurso) {
        return repositorioCurso.findById(idCurso).orElse(null);
    }

    @Override
    public void eliminarCurso(int idCurso) {
        repositorioCurso.deleteById(idCurso);
    }

    @Override
    public List<Curso> listarCurso() {
        return repositorioCurso.findAll();
    }
}
