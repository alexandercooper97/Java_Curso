public class Trigonometria {
    public static void main(String[] args) {
        double angulo = Math.toRadians(45); // Convertimos 45 grados a radianes
        double seno = Math.sin(angulo);
        double coseno = Math.cos(angulo);
        double tangente = Math.tan(angulo);

        System.out.println("Seno de 45 grados: " + seno);
        System.out.println("Coseno de 45 grados: " + coseno);
        System.out.println("Tangente de 45 grados: " + tangente);
    }
}
