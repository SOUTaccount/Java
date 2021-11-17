import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        for (String i : scanner.nextLine().split(" ")){
            if (Integer.parseInt(i) > 0) one.add(Integer.parseInt(i));}
        for (String i : scanner.nextLine().split(" ")){
            if (Integer.parseInt(i) > 0) two.add(Integer.parseInt(i));}
        Collections.sort(one);
        Collections.sort(two);
        for (int i=0;i<one.size();i++){
            for (int j=0;j<two.size();j++)
                if (one.get(i).equals(two.get(j)))
                    three.add(one.get(i));}
        Collections.sort(three);
        for (int i=0;i<three.size();i++){
            for (int j=0;j<three.size()-1;j++){
                if (three.get(j)==three.get(j+1)){
                    three.remove(j);}}}
        for (int i=0;i<three.size();i++){
            System.out.print(three.get(i) + " ");}
    }

    }
