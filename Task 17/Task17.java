import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e = new Scanner(System.in);
        int c = e.nextInt();
        int chet=1;
        int nechet=0;
        while (c>0) {
            int t = c % 10;
            if (t%2==0)
                chet*=t;
            else
                nechet++;
            c=c/10;
        }
        if (chet==1)
            chet=0;
        System.out.print(nechet +" "+ chet);
    }
}
