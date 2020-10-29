/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.controlador;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class Sumar extends Operacion{
    Double suma;

    /**
     * Metodo que recibe dos parametros y los suma.
     * Devuelve el resultado de la suma.
     * @param primernumero primer numero ingresado por consola.
     * @param segundonumero segundo numero ingresado por consola.
     */
   public Sumar (double primernumero, double segundonmuero){
       super(primernumero, segundonmuero, '+');
       suma=primernumero+segundonmuero;
       this.setResultado(suma); 
   }
}
