import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        ArrayList<Integer> array1= new ArrayList<>(a);
        for (int i=0;i<a;i++){
            array1.add(scanner.nextInt());}
        int b=scanner.nextInt();
        for (int i=a;i<a+b;i++){
            array1.add(scanner.nextInt());}
        Collections.sort(array1);
        Collections.reverse(array1);
        for(int i=0;i<array1.size();i++)
            System.out.print(array1.get(i) + " ");
    }

    }
