package com.concepts.controlflow;

/**
 * <p>
 * Es posible hacer uso de múltiples estructuras de control `if` anidadas, esto
 * se conoce como `nested if statement`.
 * 
 * La estructura de control `if` anidada permite evaluar múltiples condiciones
 * en un bloque de código.
 * </p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class NestedIfStatement {
    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        String department = "La Libertad";
        String district = "La Libertad Este";
        String city = "Antiguo Cuscatlán";

        if (department.equals("La Libertad")) {
            if (district.equals("La Libertad Este")) {
                if (city.equals("Antiguo Cuscatlán")) {
                    System.out.println("Antiguo Cuscatlán es un municipio dentro del distrito de La Libertad Este, en el departamento de La Libertad.");
                }
            }
        } else {
            System.out.println("No se encontró la ubicación.");
        }
    }
}
