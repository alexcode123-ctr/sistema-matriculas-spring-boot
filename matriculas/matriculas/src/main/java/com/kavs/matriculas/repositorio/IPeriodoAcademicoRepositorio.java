package com.kavs.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.PeriodoAcademico;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface IPeriodoAcademicoRepositorio extends JpaRepository<PeriodoAcademico, Integer> {
    
    
    List<PeriodoAcademico> findByEstado(String estado);
    
   
    PeriodoAcademico findFirstByEstadoOrderByFechaInicioDesc(String estado);
    
    
    List<PeriodoAcademico> findByFechaInicioBetween(Date inicio, Date fin);
    
    
    PeriodoAcademico findByNombrePeriodo(String nombrePeriodo);


	Optional<PeriodoAcademico> findById(PeriodoAcademico idPeriodo);
}