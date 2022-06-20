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
public class PrestamoAutomovil extends Prestamo{

    String tipo;
    String marca;
    Persona garante;
    double valorAutomovil;
    double valorMensual;

    public PrestamoAutomovil(String tipo, String marca, Persona garante
            , double valorAutomovil
            , double valorMensual
            , Persona a
            , int b
            , String c) {
        super(a, b, c);
        this.tipo = tipo;
        this.marca = marca;
        this.garante = garante;
        this.valorAutomovil = valorAutomovil;
        this.valorMensual = valorMensual;
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

    public void establecerValorMensual(double a) {
        valorMensual = a;
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


    
    
    
}
