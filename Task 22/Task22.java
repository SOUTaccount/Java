import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int c=0;
        int n=in.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = in.nextInt();}
        for (int i=0;i<n-1;i++){
            if (a[i] > a[i+1])
                c++;}
        System.out.println(c);
    }
}
