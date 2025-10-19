
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

    public static boolean check(Integer x) {
        String s = x.toString();
        if (s.length() < 2) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) > s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ls_1 = (ArrayList<Integer>) in.readObject();
        in.close();

        ObjectInputStream in_2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ls_2 = (ArrayList<Integer>) in_2.readObject();
        in_2.close();

        HashMap<Integer, Integer> map_1 = new HashMap<>();
        HashMap<Integer, Integer> map_2 = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (Integer x : ls_1) {
            if (check(x)) {
                set.add(x);
                map_1.put(x, map_1.getOrDefault(x, 0) + 1);
            }
        }

        for (Integer x : ls_2) {
            if (check(x)) {
                set.add(x);
                map_2.put(x, map_2.getOrDefault(x, 0) + 1);
            }
        }

        for (Integer x : set) {
            if (map_1.containsKey(x) && map_2.containsKey(x)) {
                System.out.println(x + " " + map_1.get(x) + " " + map_2.get(x));
            }
        }
    }
}
