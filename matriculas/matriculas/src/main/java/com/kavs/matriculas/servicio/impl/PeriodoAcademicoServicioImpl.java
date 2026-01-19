package com.kavs.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kavs.matriculas.modelo.entidad.PeriodoAcademico;
import com.kavs.matriculas.repositorio.IPeriodoAcademicoRepositorio;
import com.kavs.matriculas.servicios.IPeriodoAcademicoServicio;

@Component
@Service
public class PeriodoAcademicoServicioImpl implements IPeriodoAcademicoServicio {

    @Autowired
    private IPeriodoAcademicoRepositorio repositorioPeriodo;

    @Override
    public PeriodoAcademico insertarPeriodoAcademico(PeriodoAcademico nuevoPeriodo) {
        return repositorioPeriodo.save(nuevoPeriodo);
    }

    @Override
    public PeriodoAcademico editarPeriodoAcademico(PeriodoAcademico idPeriodo) {
        return repositorioPeriodo.findById(idPeriodo).get();
    }

    @Override
    public void eliminarPeriodoAcademico(int idPeriodo) {
        repositorioPeriodo.deleteById(idPeriodo);
    }

    @Override
    public List<PeriodoAcademico> listarPeriodosAcademicos() {
        return repositorioPeriodo.findAll();
    }
}
