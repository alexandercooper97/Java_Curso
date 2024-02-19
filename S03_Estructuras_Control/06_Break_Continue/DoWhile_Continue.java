
public class DoWhile_Continue {
    public static void main(String[] args) {
        int j = 0;
        do {
            j++;
            if (j % 2 != 0) {
                continue;
            }
            System.out.println(j);
        } while (j < 10);
        // Output: 2, 4, 6, 8, 10
    }
}
