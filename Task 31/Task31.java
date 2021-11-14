import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        for (String i : scanner.nextLine().split(" ")){
            if (Integer.parseInt(i) > 0) one.add(Integer.parseInt(i));}
        for (String i : scanner.nextLine().split(" ")){
            if (Integer.parseInt(i)%2==0) one.add(Integer.parseInt(i));}
        for (String i : scanner.nextLine().split(" ")){
            if (Integer.parseInt(i)%7==0) one.add(Integer.parseInt(i));}
        Collections.sort(one);
        for (int i=0;i<one.size();i++){
            System.out.print(one.get(i) + " ");}
    }

    }
