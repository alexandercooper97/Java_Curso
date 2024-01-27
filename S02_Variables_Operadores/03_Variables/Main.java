public class Main {
    public static void main(String [] args){
        String nombre;
        int a,b,c;

        nombre = "Alexander";
        int edad = 25;

        a = 1;
        b = 2;
        c = 3;

        System.out.println(edad);
        System.out.println(nombre);

        edad = 26;

        System.out.println(edad);
        System.out.println(a+b+c);

        //Nueva forma de definir variables 
        var primerNombre = "Miguel";
        var segundoNombre = "Alexander";
        var misNombres = primerNombre + segundoNombre;

        System.out.println("Mis nombres son : " + misNombres);
    }
    
}
