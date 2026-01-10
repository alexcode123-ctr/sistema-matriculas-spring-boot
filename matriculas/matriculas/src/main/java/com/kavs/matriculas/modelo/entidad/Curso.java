package com.kavs.matriculas.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
public class Curso implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    
    private String codigoCurso; // Ej: "MAT101"
    private String nombreCurso;
    private String descripcionCurso;
    private int creditos; // 3, 4, 5 créditos
    private int cupoMaximo; // Máximo de estudiantes
    private String estadoCurso; // DISPONIBLE, CERRADO, CANCELADO
    
    // Relación con Profesor
    @ManyToOne
    @JoinColumn(name = "idProfesor")
    private Profesor profesor;
}