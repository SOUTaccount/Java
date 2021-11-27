import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {

    }
    static boolean isPrime(long n){
        boolean b=true;
        for (long i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                b = false;
                break;
            } else
                b = true;
        }
        return b;

    }
}
