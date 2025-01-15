# Métodos (funciones)

Una función o método en java, es un bloque de código que realiza una o un conjunto de tareas específicas, y se ejecuta únicamente cuando este es invocado o llamado.

Las funciones permiten dividir un programa en bloques más pequeños, lo cual facilita la legibilidad y mantenimiento del código.

En **java**, una función se conoce como método.

## ¿Por qué utilizar métodos?

Los métodos abren la posibilidad de reutilizar código, evitando la repetición de código.

## Composición de un método

Los métodos pueden recibir parámetros y devolver un valor o simplemente realizar una tarea sin devolver nada.

En Java, los métodos se definen dentro de una clase, y estos pueden ser de dos tipos:

- **Métodos de instancia**: es decir, se asocian a un objeto (instancia de una Clase) y estos pueden acceder a los atributos de la clase.
- **Métodos estáticos**: No requieren una instancia de la clase para ser invocados.

Los métodos a su vez, se componen de un modificador de acceso, un tipo de valor a retornar, un nombre y una lista de parámetros, siendo este último  opcional.

### Modificadores de acceso

Los modificadores de acceso son "palabras clave" que definen la `visibilidad` de un método, es decir, desde donde estos pueden ser llamados.

Los modificadores de acceso son:

- **public**: Accesible desde cualquier clase del programa (Global)
- **protected**: Accesible desde la misma clase, clases del mismo paquete y subclases.
- **default**: Accesible desde la misma clase y clases del mismo paquete.
- **private**: Accesible únicamente desde la misma clase.

### Tipo de retorno

Los tipos de retorno indican el tipo de dato que el método puede devolver al ser invocado. Estos tipos pueden ser de tipo primitivos (`byte`, `short`, `int`, `long`, `boolean`, etc.) o no primitivos, tales como `String`, `Arrays`, `Clases`, etc.  

La palabra clave `return` se utiliza para devolver el valor
de un campo o variable, o el resultado de una expresión.

Hay que tener en cuenta que el tipo de retorno del método
debe coincidir con el tipo de dato que se desea devolver. Es decir, no se puede devolver un valor de tipo `String` en
un método que tiene un tipo de retorno `int`.

### Nombre del método

El nombre del método es un identificador que nos permite llamar o invocar a dicho método.

Por convención y buenas prácticas, se recomienda que los nombres de métodos sean verbos en minúsculas, seguido de adjetivos, sustantivos, etc. En nombres compuestos, tales como `calcular notas`, se recomienda escribir en mayúscula la primera letra de la segunda palabra y de las siguientes.

Por ejemplo:

```java
// Muy buena convención y buena práctica
public double calcularNotas() {}
public double calculateGrades() {}

// Mala convención y mala práctica
public double calcular_notas() {}
public double CalcularNotas() {}
```

> Otra buena práctica y convención, es el nombrar todos los métodos, clases, paquetes y variables en **inglés**, de esta manera el código puede ser entendible para cualquier persona.

### Parámetros

Es posible pasar valores a un método a través de parámetros para realizar algún cálculo o proceso con ellos.

Los parámetros actúan como variables dentro de un método y pueden ser definidos luego del nombre del método, como por ejemplo: `public int calculateSum(int a, int b)`.

Como podemos observar, definimos un método que recibe dos parámetros de números enteros para poder realizar la suma de ellos.

> **NOTA**: Los parámetros de un método no pueden ser accedidos fuera de su alcance. Es decir, únicamente pueden ser utilizados dentro del bloque de dicho método.

Supongamos el siguiente ejemplo:

```java
public class Example {
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public void otherMethod() {
        // Quiero acceder al valor de `a` fuera de la definición del método calculateSum()
        System.out.println(a); // Dará error al compilar del tipo `cannot find symbol`, debido a que esta variable no existe fuera del método `calculateSum()`
    }
}
```
