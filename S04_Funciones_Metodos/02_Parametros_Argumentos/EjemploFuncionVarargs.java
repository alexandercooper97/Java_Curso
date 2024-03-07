public class EjemploFuncionVarargs {
    public static int sumaVarargs(int... numeros){
        int suma = 0;
        for(int numero:numeros){
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args){
        int resultado1 = sumaVarargs(1, 2);
        int resultado2 = sumaVarargs(3, 4, 5, 6);
        int resultado3 = sumaVarargs(7, 8, 9, 10, 11, 12);

        System.out.println("La suma de 1 y 2 es: " + resultado1);
        System.out.println("La suma de 3, 4, 5 y 6 es: " + resultado2);
        System.out.println("La suma de 7, 8, 9, 10, 11 y 12 es: " + resultado3);
    }
}
