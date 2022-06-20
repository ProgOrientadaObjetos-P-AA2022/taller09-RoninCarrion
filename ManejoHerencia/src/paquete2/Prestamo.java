/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    private Persona beneficiario;
    private int timePrestamo;
    private String ciudad;

    public Prestamo(Persona a, int b, String c) {
        beneficiario = a;
        timePrestamo = b;
        ciudad = c;
    }

    public void establecerBeneficiario(Persona a) {
        beneficiario = a;
    }

    public void establecerTimePrestamo(int a) {
        timePrestamo = a;
    }

    public void establecerCiudad(String a) {
        ciudad = a;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTimePrestamo() {
        return timePrestamo;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
    
    
}
