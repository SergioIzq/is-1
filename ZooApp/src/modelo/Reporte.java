package modelo;

import modelo.Utils.TipoEnum;
import modelo.Utils.RangoFechas;

public class Reporte {
    private TipoEnum tipo;
    private RangoFechas rangoFechas;

    public Reporte(TipoEnum tipo, RangoFechas rangoFechas) {
        this.tipo = tipo;
        this.rangoFechas = rangoFechas;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public RangoFechas getRangoFechas() {
        return rangoFechas;
    }

    public void setRangoFechas(RangoFechas rangoFechas) {
        this.rangoFechas = rangoFechas;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "tipo=" + tipo +
                ", rango=" + rangoFechas +
                '}';
    }
}
