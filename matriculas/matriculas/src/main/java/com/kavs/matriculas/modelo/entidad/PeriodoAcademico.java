package com.kavs.matriculas.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class PeriodoAcademico implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPeriodo;
    
    private String nombrePeriodo; // Ej: "2024-I", "2024-II", "Verano 2024"
    private Date fechaInicio;
    private Date fechaFin;
    private String estado; // ACTIVO, CERRADO, PLANIFICACIÓN
}