package com.kavs.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.Profesor;
import java.util.List;
import java.util.Optional;

@Repository
public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer> {
    
    // Buscar por especialidad
    List<Profesor> findByEspecialidad(String especialidad);
    
    // Buscar por nombre o apellido
    List<Profesor> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    
    // Buscar por cédula
    Profesor findByCedula(String cedula);
    
    // Buscar profesores activos
    List<Profesor> findByEstado(String estado);

	Optional<Profesor> findById(Profesor idProfesor);
}