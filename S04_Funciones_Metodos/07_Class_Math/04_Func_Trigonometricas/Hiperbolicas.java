public class Hiperbolicas {
    public static void main(String[] args) {
        double valor = 1.0;
        double senoHiperbolico = Math.sinh(valor);
        double cosenoHiperbolico = Math.cosh(valor);
        double tangenteHiperbolica = Math.tanh(valor);

        System.out.println("Seno hiperbólico de " + valor + ": " + senoHiperbolico);
        System.out.println("Coseno hiperbólico de " + valor + ": " + cosenoHiperbolico);
        System.out.println("Tangente hiperbólica de " + valor + ": " + tangenteHiperbolica);
    }
}
