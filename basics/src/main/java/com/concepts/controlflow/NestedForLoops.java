package com.concepts.controlflow;

/**
 * <p>
 * También es posible colocar un bucle dentro de otro bucle, y esto se le
 * denomina bucle anidado.
 * 
 * El «bucle interior» se ejecutará una vez por cada iteración del «bucle
 * exterior».
 * 
 * Los bucles anidados son útiles cuando se desea realizar una operación
 * repetitiva en una matriz bidimensional.
 * 
 * Sintáxis:
 * 
 * <pre>
 * for (inicialización; condición; actualización) {
 *    for (inicialización; condición; actualización) {
 *      // Bloque de código a ejecutar
 *   }
 * }
 * </pre>
 * </p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class NestedForLoops {
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Imprimir una matriz de 3x3
        // El bucle exterior se encarga de imprimir las filas
        for (int i = 0; i < 3; i++) {
            // El bucle interior se encarga de imprimir las columnas
            for (int j = 0; j < 3; j++) {
                System.out.println("[" + i + "][" + j + "]");
            }
            System.out.println();
        }
    }
}
