import java.util.function.BiFunction;

public class EjemploExpresionesLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
        int resultado = suma.apply(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);
    }
}
