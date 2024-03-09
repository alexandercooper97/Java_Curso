public class EjemploParametrosFinal {
    public static void main(String[] args) {
        int resultado = sumaCuadrados(3, 4);
        System.out.println("La suma de los cuadrados de 3 y 4 es: " + resultado);
    }

    public static int sumaCuadrados(final int num1, final int num2) {
        // Las siguientes líneas de código causarían un error de compilación
        // porque intentan modificar los valores de num1 y num2, que son parámetros final:
        // num1 = num1 * num1;
        // num2 = num2 * num2;

        int cuadrado1 = num1 * num1;
        int cuadrado2 = num2 * num2;

        return cuadrado1 + cuadrado2;
    }
}
