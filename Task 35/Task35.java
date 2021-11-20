import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String [] size = scanner.next().split("");
        ArrayList<String> a = new ArrayList<>();
        for (int i = 0; i < size.length; i++){
            a.add(size[i]);}
        ArrayList<String> b =new ArrayList<>();
        for (int i = 0; i < size.length; i++){
            b.add(size[size.length-1-i]);}
        for (int i=0;i<size.length;i++){
            if (a.equals(b)){
                for (int j=0;j<a.size();j++)
                    System.out.print(a.get(j));
                break;}
            a.add(size.length, a.get(i));
            b.add(i,a.get(i));
        }
    }

    }
