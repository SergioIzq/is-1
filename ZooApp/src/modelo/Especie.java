/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author eps
 */
public class Especie {
    private String nombreComun;
    private String nombreCientifico;
    private List<String> alimentacion;
    private String estadoConservacion;
    private List<String> curiosidades;

    public Especie(String nombreComun, String nombreCientifico, List<String> alimentacion, String estadoConservacion, List<String> curiosidades) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.alimentacion = alimentacion;
        this.estadoConservacion = estadoConservacion;
        this.curiosidades = curiosidades;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public List<String> getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(List<String> alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public List<String> getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(List<String> curiosidades) {
        this.curiosidades = curiosidades;
    }
}
