import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {

    }
    static String maxLengthWord(String [] s){
        String c = "I";
        String b= "I";
        String g= "";
        Arrays.sort(s);
        for (int i = 0; i < s.length-1; i++) {
            if (s[i].length() > s[i + 1].length()) {
                c = s[i];
                s[i + 1] = s[i];
            }
            else if (s[i].length() < s[i + 1].length()) {
                b=s[i+1];}
            else if (s[i].length() == s[i + 1].length()){
                g=s[0];
            }
        }
        if (c.length()>b.length())
            return(c);
        else
            return(b);


    }
}
