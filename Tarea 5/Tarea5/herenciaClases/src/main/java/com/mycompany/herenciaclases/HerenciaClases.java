/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaclases;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author Usuario
 */
public class HerenciaClases {

    public static void main(String[] args) {
         Circulo Circulo = new Circulo ();
         Cuadrado Cuadrado = new Cuadrado();
         Linea Linea = new Linea();
         Triangulo Triangulo = new Triangulo();
         System.out.println("Forma1");
         Circulo.imprimirInformacion();
         System.out.println("===============");
         System.out.println("Forma2");
         Cuadrado.imprimirInformacion();
         System.out.println("===============");
         System.out.println("Forma3");
         Linea.imprimirInformacion();
         System.out.println("===============");
         System.out.println("Forma4");
        Triangulo.imprimirInformacion();
    }
}
