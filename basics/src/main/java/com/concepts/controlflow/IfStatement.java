package com.concepts.controlflow;

/**
 * <p>
 * Esta clase muestra cómo se utiliza la estructura de control de flujo `if` en
 * Java.
 * 
 * La estructura de control `if` permite ejecutar un bloque de código si una
 * condición es verdadera.
 * 
 * Existe además, la estructura de control `if-else`, la cual permite ejecutar
 * un bloque de código si la condición es verdadera, y otro bloque de código si
 * la condición es falsa.
 * </p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class IfStatement {
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int age = 25;

        // Condición simple con `if`, valida si la edad es mayor o igual a 18
        if (age >= 18) {
            System.out.println("¡Ya eres un adulto!");
        }

        // Condición compuesta con `if-else`, valida si la edad es mayor o igual a 18
        // y si es menor a 60
        if (age >= 18 && age < 60) {
            System.out.println("Eres un adulto joven.");
        } else {
            System.out.println("Aún eres un niño.");
        }
    }
}
