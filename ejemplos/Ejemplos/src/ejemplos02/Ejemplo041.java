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
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        int primerValor;
        int segundoValor;
        System.out.println("Ingrese un valor");
        primerValor = entrada.nextInt();
        System.out.println("Ingrese un valor");
        segundoValor = entrada.nextInt();
        obtenerSuma(primerValor, segundoValor);

    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
