package com.kavs.matriculas.servicios;
import java.util.List;

import com.kavs.matriculas.modelo.entidad.Curso;


public interface ICursoServicio {

	public Curso insertarCurso(Curso nuevoCurso);
	public Curso editarCurso(int idCurso);
	public void eliminarCurso (int idCurso);
	public List<Curso> listarCurso();
}