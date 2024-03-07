public class EjemploFuncionSuma{
    public static int suma(int num1,int num2){
        int resultado = num1 + num2;
        return resultado;
    }

    public static void main(String[] args){
        int resultado = suma(3,5);
        System.out.println("La suma de 3 y 5 : " + resultado);
    }
}