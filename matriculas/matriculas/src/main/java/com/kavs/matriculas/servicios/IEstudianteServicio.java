package com.kavs.matriculas.servicios;

import java.util.List;
import com.kavs.matriculas.modelo.entidad.Estudiante;

public interface IEstudianteServicio {

    public Estudiante insertarEstudiante(Estudiante nuevoEstudiante);

    public Estudiante editarEstudiante(Estudiante idEstudiante);

    public void eliminarEstudiante(int idEstudiante);

    public List<Estudiante> listarEstudiantes();

}
