/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertocruz.estanis.controlador;

import es.iespuertocruz.estanis.modelos.ConexionInicioBBDD;
import es.iespuertocruz.estanis.modelos.OperacionDatos;

/**
 *
 * @author Estanislao Sánchez Martín
 */
public class Operacion {
    double primernumero;
    double segundonumero;
    double resultado;
    char operacion;
    
    /**
     * Constructor de la clase
     */
    public Operacion(double primernumero, double segundonumero, char operacion) {
        this.primernumero = primernumero;
        this.segundonumero = segundonumero;
        this.operacion = operacion;
    }
    
    /**
     * Metodo que mostrará el resultado de las operaciones elegidas por consola.
     */
    public void mostrarResultado(){
        System.out.println(this.primernumero+" "
                +this.operacion+" "
                +this.segundonumero+" = "
                +this.resultado);
    }
    
    
    /**
     * Metodo que almacenará en una base de datos los resultados de la operaciones.
     */
    public void almacenarDatos(){
        ConexionInicioBBDD.crearTabla();
        OperacionDatos.insertar(primernumero, segundonumero, operacion, resultado);
    }
    
    /**
     * GETERS Y SETERS DE LA CALCULADORA
     */
    protected void setResultado(double resultado){
        this.resultado=resultado;
    }
    
}
