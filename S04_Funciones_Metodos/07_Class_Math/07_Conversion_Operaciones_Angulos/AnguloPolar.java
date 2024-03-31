public class AnguloPolar {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.0;
        double anguloPolar = Math.atan2(y, x);
        double anguloGrados = Math.toDegrees(anguloPolar);
        System.out.println("El ángulo polar de las coordenadas (" + x + ", " + y + ") es: " + anguloGrados + " grados");
    }
}
