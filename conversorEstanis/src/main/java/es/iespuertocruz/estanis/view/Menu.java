/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.view;

import es.iespuertocruz.estanis.crontroller.Convertir;
import java.util.Scanner;

/**
 *
 * @author Estanis
 */
public class Menu {
    public static void generarMenu(){
        Double numero = 0.0;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1. Pasar de Euros a Dolares.\n");
            System.out.println("2. Pasar de Dolares a Euros.\n");
            System.out.println("3. Salir.\n");
            System.out.println("Por favor elige una de las siguientes opciones: \n");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: 
                    System.out.println("Has elegido pasar de Euros a Dolares. \nIntroduce la cantidad:\n");
                    numero = sc.nextDouble();
                    Convertir.euroDolar(numero);
                    break;
                case 2:
                    System.out.println("Has elegido pasar de Dolares a Euros.\nIntroduce la cantidad:\n");
                    numero = sc.nextDouble();
                    Convertir.dolarEuro(numero);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Por favor, escribe solo numeros del 1 al 3.");    
            }
        }
    }
    
}
