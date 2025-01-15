# Sintáxis y aspectos básicos de Java

Java es un lenguaje de programación fuertemente tipado, lo que significa que cada variable debe declararse con un tipo de dato específico antes de ser utilizada. Esto garantiza la seguridad y consistencia del código, ya que el compilador puede detectar errores relacionados con los tipos durante la fase de compilación.

En Java, los tipos de datos se dividen en dos categorías principales:

## El método Main

El método `main` es el punto de entrada de cualquier programa Java. En una aplicación Java, debe haber un **único método** denominado main, definido como se especifica anteriormente. Si no se cumple esta condición, el intérprete de Java no ejecutará la aplicación. Los métodos en Java pueden realizar tareas y, al completarlas, devolver información. Sin embargo, cuando se utiliza la palabra clave void, se indica que el método llevará a cabo una tarea pero no devolverá ningún valor al finalizar.

Sintáxis de la definición del método `main`.

```java
public class MyProgram {
    public static void main(String[] args) {
        // Code application
    }
}
```

## Tipos de datos

### **1. Primitivos**

Son los tipos de datos más básicos en Java y representan valores simples. No son objetos, lo que los hace más eficientes en términos de rendimiento. Hay ocho tipos primitivos:

| Tipo de Dato | Tamaño       | Valor por Defecto  | Descripción                                      |
|--------------|--------------|--------------------|-------------------------------------------------|
| `byte`       | 8 bits       | 0                  | Entero pequeño, valores de -128 a 127.         |
| `short`      | 16 bits      | 0                  | Entero corto, valores de -32,768 a 32,767.     |
| `int`        | 32 bits      | 0                  | Entero estándar, valores de -2³¹ a 2³¹-1.      |
| `long`       | 64 bits      | 0L                 | Entero largo, valores de -2⁶³ a 2⁶³-1.         |
| `float`      | 32 bits      | 0.0f              | Números decimales de precisión simple.         |
| `double`     | 64 bits      | 0.0d              | Números decimales de precisión doble.          |
| `char`       | 16 bits      | '\u0000'          | Representa un carácter Unicode.                |
| `boolean`    | 1 bit        | `false`           | Valores `true` o `false`.                      |

### **2. Por Referencia**

Estos no son tipos primitivos y apuntan a objetos o arreglos (arrays). Los tipos por referencia incluyen:

- **Cadenas de texto**: Representadas por la clase `String`.
- **Arrays**: Colecciones de elementos del mismo tipo.
- **Clases y Objetos**: Definidos por el programador.
- **Interfaces**: Plantillas para implementar comportamientos específicos.

## Modificadores de Acceso en Java

| Modificador   | Clase    | Paquete  | Subclase | Global   |
|---------------|----------|----------|----------|----------|
| `public`      | ✅       | ✅       | ✅       | ✅       |
| `protected`   | ✅       | ✅       | ✅       | ❌       |
| `(default)*`  | ✅       | ✅       | ❌       | ❌       |
| `private`     | ✅       | ❌       | ❌       | ❌       |

> **Nota**: El modificador (default) se refiere al acceso sin especificar un modificador explícito, también conocido como *package-private*.

## Variables

Para declarar una variable se sigue la siguiente sintáxis: `[tipo] [nombreVariable];` o si se requiere que la variable inicie con un valor predefinido `[tipo] [nombreVariable] = [valor];`.

Por ejemplo:

```java
public class MyProgram {
    public static void main(String[] args) {
        // Declaracion variable
        int num = 500;
    }
}
```

En el ejemplo anterior, creamos una variable con el tipo de dato primitivo `int`, la cual contiene el nombre de `num` y tiene asignado por defecto el valor de `500`.

Para más ejemplos ver el archivo `Variables.java`.
