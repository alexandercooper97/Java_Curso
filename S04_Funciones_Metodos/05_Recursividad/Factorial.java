public class Factorial {
    public static void main(String[] args) {
        // Prueba de la función factorial
        int numero = 5; // Puedes cambiar el número aquí para calcular el factorial de otro número
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }

    public static int factorial(int n) {
        // Caso base
        if (n == 0) {
            return 1;
        }
        // Caso recursivo
        else {
            return n * factorial(n - 1);
        }
    }
}
