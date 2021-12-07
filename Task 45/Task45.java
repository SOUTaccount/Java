import java.io.IOException;
import java.math.BigInteger;
import java.util.*;

public class Task {
    private static Map<String, TreeSet<String>> friends = new TreeMap<>();
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] pairs;

        List<String> list = new ArrayList();
        while (in.hasNext()) {
            String s = in.nextLine();
            list.add(s);
        }
        for (String pair : list) {
            addFriends(pair);
        }
        printAllFriends();
    }
    public static void addFriends(String pair) {
        String first = pair.split(" ")[0];
        String second = pair.split(" ")[1];
        put(first, second);
        put(second, first);
    }
    private static void put(String one, String two) {
        if (!friends.containsKey(one)) {
            friends.put(one, new TreeSet<>());
        }
        friends.get(one).add(two);
    }

    public static void printAllFriends() {
        for (Map.Entry<String, TreeSet<String>> pair : friends.entrySet()) {
            System.out.println( pair.getKey() + " дружит с : " + String.join(" ",pair.getValue()) + " ");;
        }
    }
}
