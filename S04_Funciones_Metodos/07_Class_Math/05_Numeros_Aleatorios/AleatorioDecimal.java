public class AleatorioDecimal {
    public static void main(String[] args) {
        double minimo = 2.5;
        double maximo = 7.5;
        double aleatorio = minimo + (Math.random() * (maximo - minimo));
        System.out.println("Número aleatorio decimal entre " + minimo + " y " + maximo + ": " + aleatorio);
    }
}
