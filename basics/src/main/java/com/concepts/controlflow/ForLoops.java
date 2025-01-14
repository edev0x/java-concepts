package com.concepts.controlflow;

/**
 * 
 * <p>
 * La estructura de control `for` es una estructura de control de flujo que
 * permite ejecutar un bloque de código un número específico de veces.
 * 
 * La estructura `for` es muy útil cuando se conoce el número de iteraciones que
 * se deben realizar.
 * 
 * Se compone de tres partes:
 * <ul>
 * 
 * <li><strong>Inicialización: </strong> Se ejecuta una vez al inicio del
 * bucle.</li>
 * <li><strong>Condición: </strong>Se evalúa antes de cada iteración. Si es
 * verdadera, se ejecuta
 * el bloque de código.</li>
 * <li><strong>Actualización: </strong> Se ejecuta al final de cada
 * iteración.</li>
 * 
 * </ul>
 * Sintáxis:
 * 
 * <pre>
 * for (inicialización; condición; actualización) {
 *    // Bloque de código a ejecutar
 * }
 * </pre>
 * 
 * </p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class ForLoops {
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Imprimir los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        /*
         * Imprimir los números del 10 al 1
         * En este caso, la variable `i` se inicializa en 10, y se decrementa en cada
         * iteración
         * hasta que la condición `i >= 1` sea falsa.
         */
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // Imprimir los números pares del 1 al 10
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        // Imprimir la tabla de multiplicar del 5
        int multiplier = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multiplier + " x " + i + " = " + multiplier * i);
        }

        /**
         * Exite además una forma de simplificar la estructura `for` cuando se desea
         * recorrer una colección de elementos, como un arreglo o una lista.
         *
         * Esta estructura se conoce como `for-each` o `enhanced for loop` y es
         * la más utilizada para recorrer arreglos.
         */

        // Imprimir los elementos de un arreglo
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
