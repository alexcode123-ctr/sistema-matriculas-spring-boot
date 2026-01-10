package com.kavs.matriculas.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
public class Profesor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private String especialidad; // Ej: "Matemáticas", "Física", "Programación"
    private String estado; // ACTIVO, INACTIVO, LICENCIA
}