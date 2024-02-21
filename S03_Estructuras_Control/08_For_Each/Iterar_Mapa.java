import java.util.*;
public class Iterar_Mapa {
    public static void main(String[] args) {
        Map<String, Integer> estudiantes = new HashMap<>();
        estudiantes.put("Juan", 25);
        estudiantes.put("Pablo", 30);
        estudiantes.put("Maria", 35);
        for (Map.Entry<String, Integer> estudiante : estudiantes.entrySet()) {
            System.out.println(estudiante.getKey() + " tiene " + estudiante.getValue() + " años");
        }
    }
}
