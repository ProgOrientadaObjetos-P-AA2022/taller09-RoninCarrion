/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    String lvlEstudio;
    InstitucionEducativa centroEducativo;
    double valorCarrera;
    double valorMensual;

    public PrestamoEducativo(String lvlEstudio
            , InstitucionEducativa centroEducativo
            , double valorCarrera
            , double valorMensual
            , Persona a
            , int b
            , String c) {
        super(a, b, c);
        this.lvlEstudio = lvlEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensual = valorMensual;
    }

    
    

    public void establecerLvlEstudio(String a) {
        lvlEstudio = a;
    }

    public void establecerCentroEducativo(InstitucionEducativa a) {
        centroEducativo = a;
    }

    public void establecerValorCarrera(double a) {
        valorCarrera = a;
    }

    public void establecerValorMensual(double a) {
        valorMensual = a;
    }

    public String obtenerLvlEstudio() {
        return lvlEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
    
    
    
}
