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
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String a, String b) {
        nombre = a;
        siglas = b;
    }
    

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
