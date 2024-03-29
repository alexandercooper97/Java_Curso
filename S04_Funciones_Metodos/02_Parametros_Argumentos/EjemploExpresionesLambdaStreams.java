import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploExpresionesLambdaStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> paresCuadrados = numeros.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());

        System.out.println("Cuadrados de los números pares: " + paresCuadrados);
    }
}
