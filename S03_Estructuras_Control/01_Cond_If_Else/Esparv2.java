import java.util.Scanner;

public class Esparv2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese número : ");
        var n = leer.nextInt();

        if(n != 0){
            if (n > 0){
                if (n%2 == 0){
                    System.out.printf("El numero %d es PAR POSITIVO\n", n);
                }
                else{
                    System.out.printf("El numero %d es IMPAR POSITIVO\n", n);
                }
            }
            else{
                if (n%2 == 0){
                    System.out.printf("El numero %d es PAR NEGATIVO\n", n);
                }
                else{
                    System.out.printf("El numero %d es IMPAR NEGATIVO\n", n);
                }
            }

        }
        else{
            System.out.printf("El numero %d es NEUTRO\n", n);
        }
    }
}
