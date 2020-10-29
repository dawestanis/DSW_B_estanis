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
public class Dividir extends Operacion{
    Double division;
    
    /**
     * Metodo que recibe dos double y los divide. 
     * Se devuelve el resultado de esta operación.
     * @param primernumero primer numero introducido por consola.
     * @param segundonumero segundo numero introducido por consola.
     */
    public Dividir(double primernumero, double segundonumero){
        super(primernumero, segundonumero, '/');
        division=primernumero/segundonumero;
        this.setResultado(division);
    }
    
}
