/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipo;
    private String marca;
    private Persona garante;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(String tipe, String brand, Persona guarantor,
            double valAutomovil,
            Persona a,
            int b,
            String c) {
        super(a, b, c);
        tipo = tipe;
        marca = brand;
        garante = guarantor;
        valorAutomovil = valAutomovil;
    }

    public void establecerTipo(String a) {
        tipo = a;
    }

    public void establecerMarca(String a) {
        marca = a;
    }

    public void establecerGarante(Persona a) {
        garante = a;
    }

    public void establecerValorAutomovil(double a) {
        valorAutomovil = a;
    }

    public void establecerValorMensual() {
        valorMensual = valorAutomovil / timePrestamo;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String obtenerCiudad() {
        return ciudad.toUpperCase();
    }

    @Override
    public String toString() {
        String cadena = String.format("\t\tPRÉSTAMO DE AUTOMÓVIL\n"
                + "Información del Garante: \n%s\n"
                + "Información del Beneficiario: \n%s\n"
                + "Tiempo de Préstamo: %s\n"
                + "Ciudad: %s\n"
                + "\t>> Tipo de Automóvil: %s\n"
                + "\t>> Marca del Automóvil: %s\n"
                + "\t>> Valor del Automóvil: %.2f\n"
                + "\t>> Valor de las Cuotas: %.2f\n"
                + "--------------------------------------------------", garante,
                beneficiario,
                timePrestamo,
                ciudad,                
                tipo,
                marca,
                valorAutomovil,
                valorMensual);
        return cadena;
    }

}
