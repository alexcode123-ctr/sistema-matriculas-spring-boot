package com.kavs.matriculas.servicios;

import java.util.List;
import com.kavs.matriculas.modelo.entidad.PeriodoAcademico;

public interface IPeriodoAcademicoServicio {

    public PeriodoAcademico insertarPeriodoAcademico(PeriodoAcademico nuevoPeriodo);

    public PeriodoAcademico editarPeriodoAcademico(PeriodoAcademico idPeriodo);

    public void eliminarPeriodoAcademico(int idPeriodo);

    public List<PeriodoAcademico> listarPeriodosAcademicos();
}
