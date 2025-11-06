package modelo;

import java.time.LocalDate;

/**
 * Representa un rango de fechas para generar reportes.
 * 
 * @author eps
 */
public class RangoFechas {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public RangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        if (fechaInicio.isAfter(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de fin.");
        }
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Desde " + fechaInicio + " hasta " + fechaFin;
    }
}
