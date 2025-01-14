package com.concepts.syntax;

/**
 * @author edev0x
 * @version 0.0.1
 * 
 * Esta clase muestra cómo declarar variables en Java.
 * 
 * En Java, existen varios tipos de datos primitivos, los cuales son:
 *          - byte: 8 bits, valores entre -128 y 127
 *          - short: 16 bits, valores entre -32,768 y 32,767
 *          - int: 32 bits, valores entre -2,147,483,648 y 2,147,483,647
 *          - long: 64 bits, valores entre -9,223,372,036,854,775,808 y
 *          9,223,372,036,854,775,807
 *          - float: 32 bits, valores entre 1.4e-45 y 3.4e+38. 
 *          - double: 64 bits, valores entre 4.9e-324 y 1.8e+308.
 *          - char: 16 bits, valores entre '\u0000' y '\uffff'
 *          - boolean: valores lógicos, como True o False {1,0} respectivamente
 *          - String: cadena de caracteres, no es un tipo de dato primitivo,
 *          pero es muy utilizado para almacenar texto.
 */
public class Variables {
    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        int age = 25;
        double weight = 65.5;
        String name = "John Doe";
        boolean isStudent = true;
        char tab = '\t';
        long population = 7_900_000_000L;
        float pi = 3.14159f;
        byte b = 127;
        short s = 32767;


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Is student: " + isStudent);
        System.out.println("Tab: " + tab);
        System.out.println("Population: " + population);
        System.out.println("Pi: " + pi);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
    }
}
