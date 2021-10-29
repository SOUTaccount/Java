import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b=in.next();
        //a.compareTo(b);
        int result=a.compareTo(b);
        if (result>0){
            System.out.println(b);}
        else
            System.out.println(a);

        if (result==0)
            System.out.println(a+b);
    }
}
