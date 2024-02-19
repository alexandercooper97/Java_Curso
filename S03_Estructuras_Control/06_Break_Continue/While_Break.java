
public class While_Break {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        }
        // Salida: 0 1 2 3 4
    }
}
