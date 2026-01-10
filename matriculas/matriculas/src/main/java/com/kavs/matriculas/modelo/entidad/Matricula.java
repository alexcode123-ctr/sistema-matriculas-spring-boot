package com.kavs.matriculas.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Matricula implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMatricula;
    
    private Date fechaMatricula;
    private String descripcionMatricula;
    private String estadoMatricula; // PENDIENTE, CONFIRMADA, ANULADA
    
    // Relación con Estudiante
    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;
    
    // Relación con Curso
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
    
    // Nueva relación con PeriodoAcademico
    @ManyToOne
    @JoinColumn(name = "idPeriodo")
    private PeriodoAcademico periodoAcademico;
}