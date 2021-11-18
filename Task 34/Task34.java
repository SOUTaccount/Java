import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String [] a = scanner.next().split("");
        String[][] array = new String[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 0) {
                    array[i][j] = a[j];
                }
                if (i > 0 && i<a.length-1) {
                    array[i][0] = array[0][i]; } // заполняю 1 элемент i-ой строки
                if (j == a.length - 1 && i != 0) {
                    array[i][a.length - 1] = array[0][a.length-1 - i]; } //заполняю последний элемент i-ой строки
                if (i == a.length - 1) {
                    array[a.length - 1][j] = array[0][a.length-1-j]; } //заполняю послденюю строку
                if (j > 0 && j <= a.length - 2 && i != 0 && i != a.length - 1) {
                    array[i][j] = "0"; } // заполняю середину нулями
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
