public class RecursividadDirecta {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma(n));
    }

    public static int suma(int n) {
        // Caso base
        if (n == 0) {
            return 0;
        }
        // Caso recursivo
        else {
            return n + suma(n - 1);
        }
    }
}
