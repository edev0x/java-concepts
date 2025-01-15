package com.concepts.methods;

/**
 * <p>
 * Sintáxis:
 * 
 * <pre>
 * [modificador de acceso] [tipo de retorno] [nombre del método] ([parámetros]) {
 *    // Bloque de código a ejecutar
 * }
 * </pre>
 * </p>
 * 
 */
public class Methods {
    void sayHello() {
        System.out.println("Hello, World!");
    }

    void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int sum(int a, int b) {
        return a + b;
    }

    // Ejemplo de métodos estáticos
    static void sayGoodbye() {
        System.out.println("Goodbye, World!");
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        /**
         * Para invocar un método estático, no es necesario crear una instancia de la
         * clase, simplemente se invoca el método utilizando el nombre de la clase.
         * 
         * Para invocar un método no estático, es necesario crear una instancia de la
         * clase, y luego invocar el método utilizando el nombre de la instancia.
         * 
         * Para más detalles sobre que es una instancia o un objeto, ver los ejemplos de
         * Programación Orientada a Objetos (POO) dentro del directorio
         * `intermediate/oop`.
         */
        Methods methods = new Methods();
        methods.sayHello();
        methods.sayHello("Pedro Perez");

        // Llamada a método no estático mediante una instancia de la clase Methods
        int result = methods.sum(5, 3);
        System.out.println("5 + 3 = " + result);

        sayGoodbye();
        int product = Methods.multiply(5, 3); // Llamada a método estático
        System.out.println("5 * 3 = " + product);
    }
}
