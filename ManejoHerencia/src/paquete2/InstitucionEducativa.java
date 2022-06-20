/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ronni
 */
public class InstitucionEducativa {
    String nombre;
    String siglas;

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerSiglas(String a) {
        siglas = a;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    
    
}
