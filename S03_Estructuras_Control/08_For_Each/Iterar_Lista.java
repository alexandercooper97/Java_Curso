import java.util.*;

public class Iterar_Lista{
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pablo");
        nombres.add("Maria");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}