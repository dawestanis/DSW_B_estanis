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
public class Multiplicar extends Operacion{
    Double multiplicacion;
    
    /**
     * Metodo que recibe dos parametros y los multiplica. 
     * Devuelve el resultado de esta operación.
     * @param primernumero primer numero ingresado por consola.
     * @param segundonumero segundo numero ingresado por consola.
     */
    public Multiplicar(double primernumero, double segundonumero){
        super(primernumero,segundonumero,'*');
        multiplicacion = primernumero * segundonumero;
        this.setResultado(multiplicacion);
    }
}
