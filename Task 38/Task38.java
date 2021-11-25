import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {

    }
    static void sort(int [] a){
        int c=0;
        for (int i=0;i<a.length;i++){
            for (int j=1;j<a.length;j++)
                if (a[j-1] > a[j]){

                    c=a[j-1];
                    a[j-1]=a[j];
                    a[j]=c;}}

    }
}
