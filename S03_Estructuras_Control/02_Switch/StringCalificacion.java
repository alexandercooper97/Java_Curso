import java.io.Console;

public class StringCalificacion {
    public static void main(String[] args) {
        Console console = System.console();
        
        //System.out.print("Ingrese calificacion (A, B, C, D o F): ");
        String calificacion = console.readLine("Ingrese calificacion (A, B, C, D o F): ");
       

        switch (calificacion) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Bueno");
                break;
            case "C":
                System.out.println("Regular");
                break;
            case "D":
                System.out.println("Insuficiente");
                break;
            case "F":
                System.out.println("Reprobado");
                break;
            default:
                System.out.println("Calificación no válida");
        }
    }
}
