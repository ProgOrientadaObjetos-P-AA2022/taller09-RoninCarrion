/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author ronni
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected String userName;

    public Persona(String a, String b, String c) {
        nombre = a;
        apellido = b;
        userName = c;
    }

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerApellido(String a) {
        apellido = a;
    }

    public void establecerUserName(String a) {
        userName = a;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUserName() {
        return userName;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t>> Nombre: %s\n"
                + "\t>> Apellido: %s\n"
                + "\t>> UserName: %s\n",
                 nombre,
                 apellido,
                 userName);
        return cadena;
    }

}
