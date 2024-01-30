
public class DiaSemana {
    public static void main(String[] args){
        int dia = 5;
        String diaDeLaSemana;

        switch (dia) {
            case 1:
                diaDeLaSemana = "Lunes";
                break;
            case 2:
                diaDeLaSemana = "Martes";
                break;
            case 3:
                diaDeLaSemana = "Miércoles";
                break;
            case 4:
                diaDeLaSemana = "Jueves";
                break;
            case 5:
                diaDeLaSemana = "Viernes";
                break;
            case 6:
                diaDeLaSemana = "Sábado";
                break;
            case 7:
                diaDeLaSemana = "Domingo";
                break;
            default:
                diaDeLaSemana = "Número inválido";
        }

        System.out.println("El día de la semana es: " + diaDeLaSemana);
    }
}
