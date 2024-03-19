public class Fibonacci {
    public static void main(String[] args) {
        // Prueba de la función fibonacci
        int numero = 10; // Puedes cambiar el número aquí para calcular el término de Fibonacci correspondiente a otro índice
        int resultado = fibonacci(numero);
        System.out.println("El término de Fibonacci en la posición " + numero + " es: " + resultado);
    }

    public static int fibonacci(int n) {
        // Casos base
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Caso recursivo
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
