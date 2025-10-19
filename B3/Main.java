
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static boolean check(Integer x) {
        String s = x.toString();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            r--;
            l++;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> ls = (ArrayList<Integer>) in.readObject();
        in.close();

        TreeSet<Integer> set = new TreeSet<>();

        for (Integer x : ls) {
            if (x >= 100 && check(x)) {
                set.add(x);
            }
        }

        for (Integer x : set) {
            System.out.println(x);
        }
    }
}
