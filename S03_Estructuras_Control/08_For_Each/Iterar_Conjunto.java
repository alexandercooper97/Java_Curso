import java.util.*;
public class Iterar_Conjunto {
    public static void main(String[] args) {
        Set<Integer> edades = new HashSet<>();
        edades.add(25);
        edades.add(30);
        edades.add(35);
        for (Integer edad : edades) {
            System.out.println(edad);
        }
    }
}
