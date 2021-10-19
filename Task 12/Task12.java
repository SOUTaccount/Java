import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e= new Scanner(System.in);
        long f = e.nextLong();
        long b = e.nextLong();
        long g = f/b;
        long x=f%b;
        System.out.print(g+" "+x);
    }
}
