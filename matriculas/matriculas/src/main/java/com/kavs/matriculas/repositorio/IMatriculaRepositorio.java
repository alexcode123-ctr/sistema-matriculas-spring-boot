package com.kavs.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.Matricula;
import java.util.List;
import java.util.Optional;

@Repository
public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer> {
    // Métodos personalizados
    List<Matricula> findByEstudianteIdEstudiante(int idEstudiante);
    List<Matricula> findByCursoIdCurso(int idCurso);
	Optional<Matricula> findById(Matricula idMatricula);
}
