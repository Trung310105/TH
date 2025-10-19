
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            cnt++;
            map.put(cnt, s);
        }

        ArrayList<Movies> ls = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String ma = sc.nextLine();
            String ngay = sc.nextLine();
            String ten = sc.nextLine();
            int tap = Integer.parseInt(sc.nextLine());
            int id = Integer.parseInt(ma.substring(2));
            ls.add(new Movies(map.get(id), ngay, ten, tap));
        }

        Collections.sort(ls, (x, y) -> {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.parse(x.ngay).compareTo(sdf.parse(y.ngay));
            } catch (Exception e) {
                return 0;
            }
        });

        for (Movies x : ls) {
            System.out.println(x);
        }
    }
}
