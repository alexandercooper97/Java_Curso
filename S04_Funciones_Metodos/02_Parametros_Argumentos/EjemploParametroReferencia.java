public class EjemploParametroReferencia {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        incrementarPrimerElemento(numeros);
        System.out.println("El valor del primer elemento después de llamar a incrementarPrimerElemento: " + numeros[0]);
    }

    public static void incrementarPrimerElemento(int[] arr) {
        arr[0]++;
        System.out.println("El valor del primer elemento dentro de la función incrementarPrimerElemento: " + arr[0]);
    }
}