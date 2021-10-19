import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner b=new Scanner (System.in);
        long a=b.nextLong();
        long c=b.nextLong();
        long e=a%c;
        System.out.print(e);
    }
}
