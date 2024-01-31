import java.util.Scanner;

public class EstacionAnioMes {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese número del mes : ");
        var mes = leer.nextInt();

        //int mes = 3; // Marzo
        String estacion = " ";

        switch(mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;

            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;

            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
                
            default:
                estacion = "Otoño";
        }
        System.out.println("La estación del año es: " + estacion);
    } 
}
