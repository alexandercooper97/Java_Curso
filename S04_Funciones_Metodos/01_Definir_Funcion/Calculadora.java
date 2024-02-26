public class Calculadora {
    // Función que suma dos números enteros
    public int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }
    
    public static void main(String[] args) {
        // Crear una instancia de Calculadora
        Calculadora calculadora = new Calculadora();
        
        // Llamar a la función sumar a través de la instancia
        int suma = calculadora.sumar(5, 9);
        
        // Imprimir el resultado
        System.out.println(suma);
    }
}
