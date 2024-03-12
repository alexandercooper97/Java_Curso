public class EjemploRecursion {
    public long factorial(long numero) {
        // Condición base: si el número es 0 o 1, el factorial es 1
        if (numero <= 1) {
            return 1;
        }
        // Llamada recursiva: multiplicar el número por el factorial de (número - 1)
        return numero * factorial(numero - 1);
    }

    public static void main(String[] args) {
        EjemploRecursion ejemplo = new EjemploRecursion();

        long factorial5 = ejemplo.factorial(5); // 5! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Factorial de 5: " + factorial5);

        long factorial10 = ejemplo.factorial(10); // 10! = 3628800
        System.out.println("Factorial de 10: " + factorial10);
    }
}
