import java.util.Scanner;

public class Esparv1{
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese número : ");
        var n = leer.nextInt();

        if (n % 2 == 0){
            System.out.println("ES PAR");
        }
        else{
            System.out.println("ES IMPAR"); 
        }
    }
}
