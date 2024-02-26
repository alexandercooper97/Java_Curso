import java.util.*;

public class EjemplosTipoRetorno {
    public int obtenerEntero() {
        return 42;
    }

    public String obtenerCadena() {
        return "Hola, mundo!";
    }

    public List<String> obtenerListaCadenas() {
        return Arrays.asList("uno", "dos", "tres");
    }

    public void funcionSinRetorno() {
        System.out.println("Esta función no devuelve ningún valor.");
    }

    public static void main(String[] args) {
        // Crear una instancia de EjemplosTipoRetorno
        EjemplosTipoRetorno ejemplos = new EjemplosTipoRetorno();

        // Llamar a los métodos y mostrar los resultados
        int entero = ejemplos.obtenerEntero();
        String cadena = ejemplos.obtenerCadena();
        List<String> listaCadenas = ejemplos.obtenerListaCadenas();

        // Imprimir los resultados
        System.out.println("Entero: " + entero);
        System.out.println("Cadena: " + cadena);
        System.out.println("Lista de Cadenas: " + listaCadenas);

        // Llamar a la función sin retorno
        ejemplos.funcionSinRetorno();
    }
}

  