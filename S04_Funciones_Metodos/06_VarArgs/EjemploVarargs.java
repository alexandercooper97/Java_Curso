import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploVarargs {
    public static void main(String[] args) {
        imprimir("Hola", "Mundo", "!");
        int suma = sumar(1, 2, 3, 4, 5);
        System.out.println("La suma es: " + suma);
        String cadenasConcatenadas = concatenar("Hola", " ", "Mundo", "!");
        System.out.println("Cadenas concatenadas: " + cadenasConcatenadas);
        List<Integer> lista = crearLista(1, 2, 3, 4, 5);
        System.out.println("Lista: " + lista);
    }

    public static void imprimir(String... mensajes) {
        for (String mensaje : mensajes) {
            System.out.print(mensaje);
        }
        System.out.println();
    }

    public static int sumar(int... numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    public static String concatenar(String... cadenas) {
        StringBuilder resultado = new StringBuilder();
        for (String cadena : cadenas) {
            resultado.append(cadena);
        }
        return resultado.toString();
    }

    public static <T> List<T> crearLista(T... elementos) {
        return new ArrayList<>(Arrays.asList(elementos));
    }
}
