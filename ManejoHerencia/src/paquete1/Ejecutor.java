/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.*;
import paquete3.*;
import paquete4.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        boolean bandera = true;
        String mensaje = "";

        System.out.println("El siguiente programa registrará datos de préstamos:\n");

        System.out.println("Ingrese su nombre: ");
        String nombre = a.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = a.nextLine();
        System.out.println("Ingrese su UserName: ");
        String user = a.nextLine();
        // Creación del Objeto de tipo persona
        Persona persona = new Persona(nombre, apellido, user);

        // Datos para luego crear el objeto de tipo Prestamo
        System.out.println("Ingrese el tiempo en meses para el que desea el\n"
                + " préstamo: ");
        int time = a.nextInt();
        a.nextLine();
        System.out.println("Ingrese la ciudad en donde se está haciendo\n"
                + " el préstamo: ");
        String city = a.nextLine();
        // Ahora le preguntaremos al usuario el tipo 
        // de préstamo que desea adquirir

        while (bandera) {
            System.out.println("Ingrese [1] Para registrar un préstamo de Automóvil.\n"
                    + "Ingrese [2] Para registrar un préstamo Educativo.\n"
                    + "Ingrese [3] Para salir del programa y/o no registrar datos.");
            String option = a.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Ingrese el tipo de automóvil: ");
                    String tipo = a.nextLine();
                    System.out.println("Ingrese la marca del Automóvil: ");
                    String marca = a.nextLine();
                    System.out.println("Ingrese el valor del Automóvil: ");
                    double valor = a.nextDouble();
                    a.nextLine();
                    System.out.println("Ingrese el nombre del Garante: ");
                    String nomGarante = a.nextLine();
                    System.out.println("Ingrese el apellido del Garante: ");
                    String apeGarante = a.nextLine();
                    System.out.println("Ingrese el Usuario del Garante: ");
                    String usuario = a.nextLine();
                    Persona p = new Persona (nomGarante, apeGarante, usuario);
                    PrestamoAutomovil pA = new PrestamoAutomovil(
                            tipo, marca, p, valor, persona, time, city);
                    pA.establecerValorMensual();
                    mensaje = String.format("%s%s\n", mensaje, pA);
                    System.out.println(mensaje);
                    break;

                case "2":
                    System.out.println("Ingrese el nombre de la Institucion Educativa: ");
                    String name = a.nextLine();
                    System.out.println("Ingrese las siglas de la Institución: ");
                    String siglas = a.nextLine();
                    InstitucionEducativa iE = new InstitucionEducativa(name, siglas);
                    System.out.println("Ingrese el nivel de Estudios: ");
                    String lvl = a.nextLine();
                    System.out.println("Ingrese el valor de la Carrera: ");
                    double value = a.nextDouble();
                    a.hasNextLine();
                    PrestamoEducativo pE = new PrestamoEducativo(
                            lvl, iE, value, persona, time, city);
                    pE.establecerValorMensual();
                    mensaje = String.format("%s%s\n", mensaje, pE);
                    System.out.println(mensaje);
                    break;
                case "3":
                    bandera = false;
                    break;

                default:
                    break;
            }
        }
        System.out.println(mensaje);

    }
}
