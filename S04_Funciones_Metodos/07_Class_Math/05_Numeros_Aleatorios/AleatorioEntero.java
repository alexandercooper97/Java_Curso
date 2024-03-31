public class AleatorioEntero {
    public static void main(String[] args) {
        int minimo = 5;
        int maximo = 10;
        int aleatorio = minimo + (int)(Math.random() * ((maximo - minimo) + 1));
        System.out.println("Número aleatorio entero entre " + minimo + " y " + maximo + ": " + aleatorio);
    }
}
