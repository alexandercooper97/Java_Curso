
public class Array_Multidimensional {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4]; // Creación de una matriz de 3 filas y 4 columnas

        // Inicialización de la matriz con valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 5;
        // ...

        // Inicialización de la matriz con bucles
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i * matriz[i].length) + j + 1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }




        String[][] tablero = new String[3][3]; // Creación de un tablero de 3x3 para un juego de tres en raya

        // Inicialización del tablero con guiones
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }

        // Imprimir el tablero en la consola
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }


    }
}
