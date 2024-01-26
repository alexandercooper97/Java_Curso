public class EjemploMultiLineComments {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        /*
         * Este bloque de código calcula la suma de todos los elementos
         * en el arreglo 'numeros' y almacena el resultado en la variable 'suma'.
         */
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        // Impresión del resultado en la consola
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
