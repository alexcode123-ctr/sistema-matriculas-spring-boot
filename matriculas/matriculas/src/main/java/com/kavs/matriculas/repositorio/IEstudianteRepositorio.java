package com.kavs.matriculas.repositorio;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.Estudiante;

@Repository
public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
    // Métodos personalizados si los necesitas
    Estudiante findByEmailEstudiante(String email);

	Optional<Estudiante> findById(Estudiante idEstudiante);
}
