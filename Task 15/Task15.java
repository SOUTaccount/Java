import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner e= new Scanner(System.in);
        int n= e.nextInt();
        int w=0;
        while (w<n){
            w++;
            System.out.print(w+" ");
        }
    }
}
