import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BigInteger bigInteger= new BigInteger(in.next());
        bigInteger=bigInteger.gcd(new BigInteger(in.next()));
        System.out.println(bigInteger);

    }
}
