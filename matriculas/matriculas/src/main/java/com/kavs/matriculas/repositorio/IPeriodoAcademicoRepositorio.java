package com.kavs.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kavs.matriculas.modelo.entidad.PeriodoAcademico;
import java.util.Date;
import java.util.List;

@Repository
public interface IPeriodoAcademicoRepositorio extends JpaRepository<PeriodoAcademico, Integer> {
    
    // Buscar períodos por estado
    List<PeriodoAcademico> findByEstado(String estado);
    
    // Buscar período actual (ACTIVO)
    PeriodoAcademico findFirstByEstadoOrderByFechaInicioDesc(String estado);
    
    // Buscar períodos por rango de fechas
    List<PeriodoAcademico> findByFechaInicioBetween(Date inicio, Date fin);
    
    // Buscar por nombre del período
    PeriodoAcademico findByNombrePeriodo(String nombrePeriodo);
}