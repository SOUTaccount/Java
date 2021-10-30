import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char [] m = a.toCharArray();
        char [] n = b.toCharArray();
        char p =' ';
        int o;
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < n.length; j++){

                if (m[i]==n[j]){
                    m[i]=p;
                    n[j]=p;
                } }}
        for (int i = 0; i < m.length; i++){ if (m[i]==' '){ o=1;} else System.out.print(m[i]);}
        for (int i = 0; i < n.length; i++){ if (n[i]==' '){ o=1;} else System.out.print(n[i]);}
    }
}
