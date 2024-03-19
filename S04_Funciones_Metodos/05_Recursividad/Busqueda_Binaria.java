public class Busqueda_Binaria {
    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // arreglo ordenado
        int valor = 11; // valor a buscar
        int resultado = busquedaBinaria(arreglo, valor, 0, arreglo.length - 1);
        if (resultado != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + resultado);
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arr, int valor, int inicio, int fin) {
        // Caso base: el valor no se encuentra en el arreglo
        if (inicio > fin) {
            return -1;
        }

        int medio = (inicio + fin) / 2;

        // Caso base: el valor se encuentra en el arreglo
        if (arr[medio] == valor) {
            return medio;
        }
        // Caso recursivo
        else if (arr[medio] > valor) {
            return busquedaBinaria(arr, valor, inicio, medio - 1);
        } else {
            return busquedaBinaria(arr, valor, medio + 1, fin);
        }
    }
}
