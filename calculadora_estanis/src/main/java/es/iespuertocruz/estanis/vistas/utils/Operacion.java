/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.vistas.utils;

import java.util.Scanner;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class Operacion {
    public static Double obtenerValor(){
        Scanner reader = new Scanner(System.in);
        Double numero=0.0;
        
        System.out.println("Introduce el numero. El cero para salir");
        do{
            try{
                numero=Double.valueOf(reader.nextInt());
            }catch(Exception exception){
                System.out.println("¡Cuidado! Solo puedes insertar numeros. ");
                reader.next();
            }
        }while(numero<=0.0);
        System.out.println("Se ha obtenido el numero de forma correcta");
        return numero;
    }
}
