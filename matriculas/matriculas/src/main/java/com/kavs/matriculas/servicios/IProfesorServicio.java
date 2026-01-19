package com.kavs.matriculas.servicios;

import java.util.List;
import com.kavs.matriculas.modelo.entidad.Profesor;

public interface IProfesorServicio {

    public Profesor insertarProfesor(Profesor nuevoProfesor);

    public Profesor editarProfesor(Profesor idProfesor);

    public void eliminarProfesor(int idProfesor);

    public List<Profesor> listarProfesores();
}
