public class Main {
  public static void main(String[] args) {
      try {
          int a = 10;
          int b = 2;

          int resultado = divide(a, b);
          System.out.println("Resultado de la división: " + resultado);

          // Intentar división por cero
          int resultadoDivisionCero = divide(a, 0);
          System.out.println("Esto no se imprimirá debido a la excepción de división por cero.");
      } catch (ArithmeticException e) {
          System.err.println("Error: " + e.getMessage());
      }
  }

  public static int divide(int a, int b) {
      if (b == 0) {
          throw new ArithmeticException("No es posible dividir entre cero.");
      }
      return a / b;
  }
}

