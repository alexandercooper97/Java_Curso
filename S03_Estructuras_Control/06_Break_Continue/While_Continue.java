
public class While_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        // Output: 1, 3, 5, 7, 9

    }
}
