import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e = new Scanner(System.in);
        int t = 555;
        while (e.hasNext()) {
            int c = e.nextInt();
            if (c < t) {
                t = c;
            }
        }
        System.out.println(t);
    }
}
