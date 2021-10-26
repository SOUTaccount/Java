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
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++)
                if (a[j-1] > a[j]){

                    c=a[j-1];
                    a[j-1]=a[j];
                    a[j]=c;}}
        for (int i:a)System.out.print(i+ " ");
    }
}
