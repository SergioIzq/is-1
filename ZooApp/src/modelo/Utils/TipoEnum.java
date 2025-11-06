/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.Utils;

/**
 *
 * @author eps
 */
public enum TipoEnum {
    DIA("Por día"),
    SEMANA("Por semana"),
    MES("Por mes"),
    RANGO_PERSONALIZADO("Rango personalizado");

    private final String descripcion;

    private TipoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
