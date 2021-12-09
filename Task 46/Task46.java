import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap <String, TreeSet<String>> map = new TreeMap<>();
        while (in.hasNext()){
            String s=in.nextLine();
            String [] ss=s.split(" ");
            String name = ss[0] + " " + ss[1];
            String values= ss[2] + " " + ss[3];
            if (map.containsKey(name)){
                map.get(name).add(values);}
            else{
                TreeSet<String> set = new TreeSet<>();
                set.add(values);
                map.put(name,set);}}

        for(String kluchi: map.keySet()){
            System.out.print("\n" + kluchi + ": " );
            for (String value: map.get(kluchi)){
                System.out.println();
                System.out.print("    " + value);
            }}}}