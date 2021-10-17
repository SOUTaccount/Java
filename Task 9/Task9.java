import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner b=new Scanner (System.in);
        float a=b.nextFloat();
        float c=b.nextFloat();
        float e=a/c;
        System.out.printf("%.2f",e);
    }
}
