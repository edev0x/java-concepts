package com.concepts.syntax;

/**
 * <p>
 * Esta clase muestra cómo se utilizan los comentarios en Java.
 * Los cuales son útiles para documentar el código fuente, y son ignorados por
 * el compilador.
 * 
 * Existen dos tipos de comentarios en Java:
 *      - Comentario de una sola línea: Se inicia con `//` y termina al final de la línea.
 *      - Comentario de varias líneas: Se inicia con `/*` y termina con `* /`.
 * </p>
 * 
 * <p>
 * Para más información ver: {@see https://www.oracle.com/java/technologies/javase/codeconventions-comments.html}
 * </p>
 * 
 * @author edev0x
 * @version 0.0.1
 */
public class Comments {

    /**
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Este es un comentario de una sola línea, y es ignorado por el compilador.

        /**
         * Este es un comentario de varias líneas.
         * 
         * Además, son útiles al hacer uso de `javadoc`, una herramienta que genera
         * documentación a partir de comentarios en el código fuente en formato HTML y
         * otros tipos haciendo uso de extensiones configurables.
         */
    }
}
