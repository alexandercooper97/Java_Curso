public class ArcTrigonometria {
    public static void main(String[] args) {
        double valor = 0.70710678118; // Aproximadamente igual al seno y coseno de 45 grados
        double anguloSeno = Math.toDegrees(Math.asin(valor));
        double anguloCoseno = Math.toDegrees(Math.acos(valor));
        double anguloTangente = Math.toDegrees(Math.atan(valor));

        System.out.println("Ángulo cuyo seno es " + valor + ": " + anguloSeno + " grados");
        System.out.println("Ángulo cuyo coseno es " + valor + ": " + anguloCoseno + " grados");
        System.out.println("Ángulo cuya tangente es " + valor + ": " + anguloTangente + " grados");
    }
}
