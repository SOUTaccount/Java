import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        boolean flag = false;
        int i;
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a = new int[n];
        for (i=0;i<n;i++) {
            a[i] = in.nextInt();
            if (a[i] > 9 && a[i] < 100 && a[i] % 2 == 0 && a[i] > 0) {
                System.out.print(a[i]+ " ");
                flag = true;
            }
        }
        if (!flag)
            System.out.println("-1");
    }
}
