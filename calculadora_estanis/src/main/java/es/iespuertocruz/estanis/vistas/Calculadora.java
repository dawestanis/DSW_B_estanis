/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.vistas;

import es.iespuertocruz.estanis.controlador.Dividir;
import es.iespuertocruz.estanis.controlador.Multiplicar;
import es.iespuertocruz.estanis.controlador.Restar;
import es.iespuertocruz.estanis.controlador.Sumar;
import static es.iespuertocruz.estanis.vistas.utils.Operacion.obtenerValor;
import java.util.Scanner;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class Calculadora {
    public static void generarVista(){
        Double primernumero, segundonumero=0.0;
        
        Scanner sc = new Scanner(System.in);
        boolean salir= false;
        int opcion; //Guardaremos la opcion del usuario
        
        while(!salir){
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Elige una de las opciones\n");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Has elegido sumar");
                    primernumero = obtenerValor();
                    segundonumero = obtenerValor();
                    Sumar suma = new Sumar(primernumero, segundonumero);
                    suma.mostrarResultado();
                    suma.almacenarDatos();
                    break;
                case 2:
                    System.out.println("Has elegido restar");
                    primernumero = obtenerValor();
                    segundonumero = obtenerValor();
                    Restar resta = new Restar(primernumero, segundonumero);
                    resta.mostrarResultado();
                    resta.almacenarDatos();
                    break;
                case 3:
                    System.out.println("Has elegido multiplicar");
                    primernumero = obtenerValor();
                    segundonumero = obtenerValor();
                    Multiplicar multiplicacion = new Multiplicar(primernumero,segundonumero);
                    multiplicacion.mostrarResultado();
                    multiplicacion.almacenarDatos();
                    break;
                case 4:
                    System.out.println("Has elegido dividir");
                    primernumero = obtenerValor();
                    segundonumero = obtenerValor();
                    Dividir division = new Dividir(primernumero, segundonumero);
                    division.mostrarResultado();
                    division.almacenarDatos();
                    break;
                case 5:
                    salir=true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }
        }
    }
}
