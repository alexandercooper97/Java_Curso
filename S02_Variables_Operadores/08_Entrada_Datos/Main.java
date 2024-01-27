import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String str = scanner.nextLine();

        System.out.print("Ingresa un número entero: ");
        int num = scanner.nextInt();

        System.out.print("Ingresa un valor booleano: ");
        boolean b = scanner.nextBoolean();

        

        System.out.println("El número ingresado es: " + num);
        
        System.out.println("El valor booleano ingresado es: " + b);

        System.out.println("La cadena de texto ingresada es: " + str);
    }

}
