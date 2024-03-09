import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class EjemploTiposRetorno { 
    public int obtenerEntero() { 
      return 42; 
    } 
  
    public String obtenerCadena() { 
      return "Hola, mundo!"; 
    } 
  
    public List<String> obtenerListaCadenas() { 
      return Arrays.asList("uno", "dos", "tres"); 
    } 
  
    public void funcionSinRetorno() { 
      System.out.println("Esta función no devuelve ningún valor."); 
    } 
  }
  