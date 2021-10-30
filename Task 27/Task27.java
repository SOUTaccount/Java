import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        char FirstLetter;
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String [] array= a.split(" ");
        for (int i=2;i< array.length;i++){
            FirstLetter=array[i].charAt(0);
            if (i==2){
                System.out.println(array[0]+":");}
            System.out.println("-" + array[i].replace(",",""));}
    }
}
