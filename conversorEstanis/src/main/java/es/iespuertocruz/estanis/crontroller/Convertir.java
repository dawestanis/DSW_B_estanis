/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.crontroller;

/**
 *
 * @author Estanis
 */
public class Convertir {

    public Convertir() {
    }
    static double euro = 0.85;
    static double dolar = 1.18;

    public static String euroDolar(double cantidad) {

        return "El resultado es: " + cantidad * dolar;

    }

    public static String dolarEuro(double cantidad) {
        return "El resultado es: " + cantidad * euro;

    }
}
