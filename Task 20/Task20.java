import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        long b = 0;
        long a = 0;
        Scanner e = new Scanner(System.in);
        long n = e.nextLong();
        while (a<=n) {
            b = b + a;
            a++;
        }
        System.out.println(b);
    }
}
