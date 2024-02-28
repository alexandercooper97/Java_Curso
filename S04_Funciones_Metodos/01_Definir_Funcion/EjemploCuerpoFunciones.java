public class EjemploCuerpoFunciones {
    public double calcularAreaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public void imprimirTablaMultiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Crear una instancia de EjemploCuerpoFunciones
        EjemploCuerpoFunciones ejemplo = new EjemploCuerpoFunciones();

        // Llamar a los métodos y mostrar los resultados
        double area = ejemplo.calcularAreaCirculo(5.0);
        System.out.println("Área del círculo: " + area);

        System.out.println("Tabla de multiplicar del 7:");
        ejemplo.imprimirTablaMultiplicar(7);

        int numeroPrimo = 11;
        boolean esPrimo = ejemplo.esNumeroPrimo(numeroPrimo);
        System.out.println(numeroPrimo + " es primo: " + esPrimo);
    }
}
