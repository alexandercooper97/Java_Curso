public class Torre_Hanoi {
    public static void main(String[] args) {
        int n = 9; // Puedes cambiar el número de discos aquí
        hanoi(n, 'A', 'C', 'B');
    }

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        // Caso base
        if (n == 1) {
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        }
        // Caso recursivo
        else {
            hanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, destino, origen);
        }
    }
}
