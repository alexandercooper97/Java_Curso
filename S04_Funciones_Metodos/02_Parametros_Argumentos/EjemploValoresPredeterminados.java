public class EjemploValoresPredeterminados {
    public static void main(String[] args) {
        String saludo1 = crearSaludo("Maria");
        String saludo2 = crearSaludo("Pedro", "¡Hola!");
        System.out.println(saludo1);
        System.out.println(saludo2);
    }

    public static String crearSaludo(String nombre) {
        return crearSaludo(nombre, "¡Bienvenido!");
    }

    public static String crearSaludo(String nombre, String mensaje) {
        return mensaje + ", " + nombre;
    }
}
