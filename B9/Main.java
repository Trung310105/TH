
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<CongNhan> ls = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String gio_vao = sc.nextLine();
            String gio_ra = sc.nextLine();
            ls.add(new CongNhan(ma, ten, gio_vao, gio_ra));
        }

        Collections.sort(ls, (x, y) -> {
            if (x.tgian != y.tgian) {
                return (y.tgian - x.tgian);
            }
            return x.ma.compareTo(y.ma);
        });

        for (CongNhan x : ls) {
            System.out.println(x);
        }
    }
}
