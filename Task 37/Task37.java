import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        printN(4);
    }
    static void printN(int n){
        String mask = "111111111";
        for (int i = 1; i <= n; i++) {
            int k = Integer.parseInt(mask.substring(0, i));
            System.out.print(i * k);
        }
    }
}
