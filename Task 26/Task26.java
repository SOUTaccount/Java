import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        char FirstLetter;
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        //String b=a.toLowerCase();
        String [] array= a.split(" ");
        for (int i=0;i< array.length;i++){
            FirstLetter=array[i].charAt(0);
            if (FirstLetter>='a' && FirstLetter<='h' || FirstLetter>='A' && FirstLetter<='H')
                System.out.println(array[i]);}
    }
}
