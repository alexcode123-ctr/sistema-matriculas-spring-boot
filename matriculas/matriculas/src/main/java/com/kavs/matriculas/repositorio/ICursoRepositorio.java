package com.kavs.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.Curso;

@Repository
public interface ICursoRepositorio extends JpaRepository<Curso, Integer> {
    // Métodos personalizados si los necesitas
    Curso findByNombreCurso(String nombre);
}