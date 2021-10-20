import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e= new Scanner(System.in);
        int n= e.nextInt();
        int c=0;
        int p=0;
        while (c<n) {
            c++;
            System.out.print('[');

            if (c==n)
                for (p=0;p<n;p++)
                    System.out.print("]");
        }

    }
}
