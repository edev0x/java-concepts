# Estructuras de Control

Las estructuras de control permiten tomar decisiones y ejecutar diferentes partes del código dependiendo de ciertas condiciones o repetir bloques de código varias veces.

Java nos ofrece dos tipos principales de estructuras de control:

1. **Estructuras selectivas**.
2. **Estructuras repetitivas o ciclos**; también conocidas como bucles.

## 1. Estructuras selectivas

En muchas actividades que realizamos día con día, nos enfrentamos a situaciones donde debemos tomar decisiones y que de una manera u otra, alteran el cauce normal de nuestra vida, y en este caso, el de nuestro `programa`.

Java cuenta con estructuras para el control flujo, es decir, tomar decisiones en base a datos o expresiones que debamos validar. Las decisiones pueden ser simples o anidadas (es decir, varias condiciones dentro de otra).

Dentro de las estructuras selectivas encontramos:

### If-Else

Evalúa una o varias condiciones y determina el flujo a seguir; si las condiciones son falsas, se ejecuta el bloque `else`.

> En la estructura `if-else`, la parte de `else` es opcional. Dependerá de la situación para hacer uso de este.

### Switch - Case

La estructura `switch` es una estructura de control de flujo muy similar a
`if-else`. Contiene varios bloques de código llamados `case`, y un bloque de código llamado `default`.

Entre sus características más importantes se encuentran:

- Evalúa una sola expresión y compara su valor con varios casos.
- Los casos pueden contener bloques de código ejecutables.
- Si no se encuentra un caso que coincida con la expresión a evaluar, se ejecuta el bloque `default` (si está definido).
- Cada caso debe contener una instrucción `break` para evitar que se ejecuten los bloques de código de los casos siguientes.

## 2. Estructuras repetitivas (bucles)

Estas estructuras permiten repetir un bloque de código varias veces.

Dentro de las estructuras repetitivas o iterativas, encontramos:

### For

Se usa cuando se conoce el número exacto de iteraciones.

### While

Se usa cuando no se conoce el número exacto de iteraciones, pero sí una condición.

### Do While

Se ejecuta al menos una vez, incluso si la condición es falsa.
