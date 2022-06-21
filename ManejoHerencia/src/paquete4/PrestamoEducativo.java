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
public class PrestamoEducativo extends Prestamo {

    private String lvlEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivelEstudio,
             InstitucionEducativa cenEducativo,
             double valCarrera,
             Persona a,
             int b,
             String c) {
        super(a, b, c);
        lvlEstudio = nivelEstudio;
        centroEducativo = cenEducativo;
        valorCarrera = valCarrera;
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

    public void establecerValorMensual() {
        valorMensual = valorCarrera / timePrestamo;
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

    @Override
    public String toString() {
        String cadena = String.format("\t\tPRÉSTAMO EDUCATIVO\n"
                + "Información del Beneficiario: \n%s\n"
                + "Información de Estudios:\n"
                + "\t>> Nivel de Estudios: %s\n"
                + "\t>> Centro Educativo: %s (%s)\n"
                + "\t>> Valor total de la carrera: %.2f\n"
                + "\t>> Valor mensual a Cancelar: %.2f\n"
                + "---------------------------------------------", beneficiario,
                lvlEstudio,
                centroEducativo.obtenerNombre(),
                centroEducativo.obtenerSiglas(),
                valorCarrera,
                valorMensual);
        return cadena;
    }

}
