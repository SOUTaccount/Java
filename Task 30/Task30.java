import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        int x;
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String [] first_buf = first.split(" ");
        int n = Integer.valueOf(first_buf[1]);

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (in.hasNext()){
            String str = in.nextLine();
            String[] str_buf = str.split(" ");

            if (str_buf[0].equals("add")){
                if (str_buf.length == 2)
                    list.add(Integer.valueOf(str_buf[1]));
                else
                    list.add(Integer.valueOf(str_buf[1]), Integer.valueOf(str_buf[2]));
            }
            else if (str_buf[0].equals("remove")){
                x = Integer.parseInt(str_buf[1]);
                list.remove(x);}

            else if (str_buf[0].equals("set"))
                list.set(Integer.valueOf(str_buf[1]), Integer.valueOf(str_buf[2]));

            else if (str_buf[0].equals("printList")) {
                StringBuilder strbuf = new StringBuilder();
                for (int st : list) {
                    strbuf.append(st + " ");
                }
                System.out.println(strbuf);
            }
        }
    }

    }
