public class EjemploParametros { 
    public int sumar(int a, int b) { 
      return a + b; 
    } 
  
    public void saludar(String nombre) { 
      System.out.println("Hola, " + nombre + "!"); 
    } 
  
    public void mostrarCoordenadas(int x, int y, int z) { 
      System.out.println("Coordenadas: (" + x + ", " + y + ", " + z + ")"); 
    } 

    public static void main(String[] args) {
        // Crear una instancia de EjemploParametros
        EjemploParametros ejemplo = new EjemploParametros();
        
        // Llamar al método sumar y mostrar el resultado
        int resultadoSuma = ejemplo.sumar(5, 7);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        
        // Llamar al método saludar
        ejemplo.saludar("Juan");
        
        // Llamar al método mostrarCoordenadas
        ejemplo.mostrarCoordenadas(1, 2, 3);
    }
}
