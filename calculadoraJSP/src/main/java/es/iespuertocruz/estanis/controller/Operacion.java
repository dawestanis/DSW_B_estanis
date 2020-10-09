/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.controller;

/**
 *
 * @author Estanis
 */
public class Operacion {

    static double resultado;

    public static double CalculoResultado(double primernumero, double segundonumero, String operador) {
        if (operador.equals("sumar")) {
            resultado = primernumero + segundonumero;
        } else if (operador.equals("restar")) {
            resultado = primernumero - segundonumero;
        } else if (operador.equals("multiplicar")) {
            resultado = primernumero * segundonumero;
        } else if (operador.equals("dividir")) {
            resultado = primernumero / segundonumero;
        }
        return resultado;
    }

}
