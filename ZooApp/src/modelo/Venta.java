package modelo;

import java.util.Date;

/**
 *
 * @author Sergio Izquierdo, Isabel Cherino, Sandra Megolla
 */
public class Venta {

    private int numero;
    private Date fecha;
    private float total;

    public Venta(int numero, Date fecha, float total) {
        this.numero = numero;
        this.fecha = fecha;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        // TODO -> COMPROBAR FECHA VALIDA
        return fecha;
    }

    public void setFecha(Date fecha) {
        // TODO -> COMPROBAR FECHA VALIDA
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
