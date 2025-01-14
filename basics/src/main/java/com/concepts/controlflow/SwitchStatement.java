package com.concepts.controlflow;

/**
 * 
 * <p>
 * La estructura `switch` es una estructura de control de flujo muy similar a
 * `if-else`.
 * 
 * Contiene varios bloques de código llamados `case`, y un bloque de código
 * llamado `default`.
 * </p>
 * 
 * <p>
 * Entre sus características más importantes se encuentran:
 * <ul>
 * <li>Evalúa una sola expresión y compara su valor con varios casos.</li>
 * <li>Los casos pueden contener bloques de código ejecutables.</li>
 * <li>Si no se encuentra un caso que coincida con la expresión a evaluar, se
 * ejecuta el bloque `default` (si está definido)</li>
 * <li>Cada caso debe contener una instrucción `break` para evitar que se
 * ejecuten los bloques de código de los casos siguientes.</li>
 * </ul>
 * </p>
 * 
 * <p>
 * <strong>Contras:</strong>
 * La sentencia `switch` está limitada a comparar valores de tipos primitivos
 * (por ejemplo, `int`, `char`, `byte`, enums e incluso Strings) y no es tan
 * flexible como `if-else` en condiciones más complejas.
 * <p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class SwitchStatement {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }

        /**
         * También es posible retornar un valor en base al caso evaluado
         * y almacenarlo en una variable.
         * 
         * Reasignamos el valor de la variable `day` a un valor inexistente en los casos
         * definidos.
         */

        day = 8;

        String dayName = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "No es un día válido";
        };

        System.out.println("El día es: " + dayName); // Imprime "El día es: Día no válido"
    }
}
