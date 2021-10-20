import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e= new Scanner(System.in);
        long f = e.nextLong();
        int n=3;
        long s=(f+n-1)/n;
        System.out.print(s);
    }
}
