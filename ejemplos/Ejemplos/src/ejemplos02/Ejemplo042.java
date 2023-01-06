/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo042 {

    public static void main(String[] args) {
        // 
        int [] arreglo1 = {100,200,300,400,500};
        int [] arreglo2 = {1000,2000,3000,4000,5000};
    
        int primerValor = 0;
        int segundoValor = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            primerValor = arreglo1[i];
            segundoValor = arreglo2[i];
            obtenerSuma(primerValor, segundoValor);
            //obtenerSuma(arreglo1[i], arreglo[2]); otra forma de hacerlo.

        }
    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
    }

}
