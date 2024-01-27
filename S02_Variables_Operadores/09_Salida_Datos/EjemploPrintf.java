public class EjemploPrintf {
    public static void main(String[] args) {
        System.out.printf("Hola %s", "Mundo!\n");

        double num = 3.14159265;
        System.out.printf("El número pi es aproximadamente %.2f", num);

        System.out.println("\n");

        String[][] tabla = {
            {"Juan", "25", "1.78"},
            {"Maria", "28", "1.65"},
            {"Pedro", "32", "1.93"}
        };
        System.out.printf("%-10s %-10s %-10s\n", "Nombre", "Edad", "Altura");
        for (String[] fila : tabla) {
            System.out.printf("%-10s %-10s %-10s\n", fila[0], fila[1], fila[2]);
        }
    }
}