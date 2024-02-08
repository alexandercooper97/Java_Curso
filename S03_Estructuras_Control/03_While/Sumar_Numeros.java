import java.util.Scanner;

public class Sumar_Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        while (true) {
            System.out.print("Ingresa un número: ");
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println("La suma de los números ingresados es: " + sum);
        
    } 
}
