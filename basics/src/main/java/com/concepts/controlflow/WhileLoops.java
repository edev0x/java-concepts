package com.concepts.controlflow;

/**
 * <p>
 * 
 * La estructura de control `while` es una estructura de control de flujo que
 * permite ejecutar un bloque de código mientras una condición sea verdadera.
 * 
 * La estructura `while` es muy útil cuando no se conoce el número de
 * iteraciones
 * que se deben realizar.
 * 
 * Sintáxis:
 * 
 * <pre>
 * while (condición) {
 *     // Bloque de código a ejecutar
 * }
 * </pre>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class WhileLoops {
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int iterations = 0;

        /**
         * En este ejemplo, el bucle se ejecutará mientras la variable `iterations` sea
         * menor a 5.
         */
        while (iterations < 5) {
            System.out.println("Iteración: " + iterations);
            iterations++;
        }

        System.out.println("Fin del bucle.\n");

        /**
         * Existe una variante de la estructura `while` llamada `do-while`, la cual
         * ejecuta el bloque de código al menos una vez, y luego evalúa la condición.
         * 
         * Supongamos que queremos evaluar si un PIN es correcto, y permitir al usuario
         * un máximo de 3 intentos. En caso de que el usuario no ingrese el PIN correcto
         * en los 3 intentos, se bloqueará la cuenta.
         */

        int correctPin = 1234; // PIN correcto (ejemplo)
        int attempts = 0; // Variable para contar el número de intentos del usuario.
        int maxAttempts = 3; // Número máximo de intentos permitidos.

        do {
            // Supongamos que el usuario ingresa el PIN 4321
            int userPin = 4321;

            if (userPin == correctPin) {
                System.out.println("Acceso autorizado. Bienvenido.");
                break; // Hacemos uso de `break` para salir del bucle.
            } else {
                System.out.println("PIN incorrecto. Inténtelo de nuevo.");
                attempts++; // Incrementamos el número de intentos.
            }
        } while (attempts < maxAttempts);

        if (attempts == maxAttempts) {
            System.out.println("Número máximo de intentos alcanzado. Por seguridad, su cuenta ha sido bloqueada temporalmente.");
        }
    }
}
