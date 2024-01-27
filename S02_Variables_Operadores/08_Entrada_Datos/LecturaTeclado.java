import java.io.Console;

public class LecturaTeclado {
    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.err.println("No se puede obtener la consola.");
            System.exit(1);
        }

        String cadena = console.readLine("Introduce una cadena: ");
        System.out.println("Has introducido la cadena: " + cadena);
    }
}
