import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e = new Scanner(System.in);
        int c = e.nextInt();
        int n;
        int x;
        for (n = 1; n <= c; n++) {
            if (c % n == 0)
                System.out.print(n + " ");
        }
    }
}
