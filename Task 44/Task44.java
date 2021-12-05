import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = in.nextInt();
        int a = 0;
        TreeSet<Integer> set = new TreeSet<>();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        for (int i : set) {
            if (counter>set.size()){
                System.out.println("-1");
                break;}
            a++;
            if (counter >= a)
                System.out.print(i + " ");
            else
                break;
        }
    }
}
