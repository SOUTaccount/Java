import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] m = a.toCharArray();
        System.out.print(m);
        for (int i = m.length-1; i >= 0; i--) {
            System.out.print(m[i]);
        }
    }
}
