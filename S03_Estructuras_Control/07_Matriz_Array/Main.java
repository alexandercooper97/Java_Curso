
public class Main {
    public static void main(String[] args) {
        String nombres [];
        nombres = new String[3];

        nombres[0]= "Alex";
        nombres[1]= "Roel";
        nombres[2]= "Juan";

        System.out.println(nombres[2]);

        nombres[2]= "Carlos";

        System.out.println(nombres[2]);

        System.out.println(nombres.length);

        int[] array1 = {1,2,3,4,5};

        System.out.println(array1[0]);
        array1[0] = 100;

        System.out.println(array1[0]);
        System.out.println(array1.length);



    }
}
