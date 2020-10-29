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
public class Restar extends Operacion{
    Double resta;

    /**
     * Metodo que recibe dos parametros y los resta.
     * Devuelve el resultado de la resta.
     * @param primernumero primer numero ingresado por consola.
     * @param segundonumero segundo numero ingresado por consola.
     */
    public Restar(double primernumero, double segundonumero) {
        super(primernumero, segundonumero, '-');
        resta=primernumero-segundonumero;
        this.setResultado(resta);
    }
}
