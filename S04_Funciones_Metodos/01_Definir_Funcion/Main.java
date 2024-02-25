public class Main{
    public static void main(String[] args) {
        // Llamar a una funcion
        saludar("Alex");

        // Llamar a un metodo
        Main s = new Main();
        s.myMetodo("Hola Mundo");
    }

    // Definicion de una Funcion
    static void saludar(String nombre){
        System.out.println("Hola" + nombre + "desde la Funcion");
    }

    // Definicion de un metodo 
    public void myMetodo(String saludo){
        System.out.println(saludo);
    }
}