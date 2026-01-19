package com.kavs.matriculas.servicios;

import java.util.List;
import com.kavs.matriculas.modelo.entidad.Matricula;

public interface IMatriculasServicio {

    public Matricula insertarMatricula(Matricula nuevaMatricula);

    public Matricula editarMatricula(Matricula idMatricula);

    public void eliminarMatricula(int idMatricula);

    public List<Matricula> listarMatriculas();
}
