package com.kavs.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.kavs.matriculas.modelo.entidad.Estudiante;
import com.kavs.matriculas.repositorio.IEstudianteRepositorio;
import com.kavs.matriculas.servicios.IEstudianteServicio;

@Service
@Component

public class EstudianteServicioImpl implements IEstudianteServicio {

    @Autowired
    private IEstudianteRepositorio repositorioEstudiante;

    @Override
    public Estudiante insertarEstudiante(Estudiante nuevoEstudiante) {
        return repositorioEstudiante.save(nuevoEstudiante);
    }

    @Override
    public Estudiante editarEstudiante(Estudiante idEstudiante) {
		// TODO Auto-generated method stub
		return repositorioEstudiante.findById (idEstudiante).get();
	}
    @Override
    public void eliminarEstudiante(int idEstudiante) {
        repositorioEstudiante.deleteById(idEstudiante);
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return repositorioEstudiante.findAll();
    }
}
