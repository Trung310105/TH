
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));

        HashMap<String, SinhVien> map = new HashMap<>();

        while (true) {
            if (!sc.hasNextLine()) {
                break;
            }
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            map.put(ma, new SinhVien(ma, ten, lop, email, sdt));
        }

        sc.close();

        Scanner scanner = new Scanner(new File("HUONGDAN.in"));

        ArrayList<HuongDan> ls = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String ten = s.substring(0, s.length() - 2);
            int n_do_an = Integer.parseInt(s.substring(s.length() - 1));

            for (int j = 0; j < n_do_an; j++) {
                String line = scanner.nextLine();
                String ma = line.substring(0, 10);
                String do_an = line.substring(11);

                ls.add(new HuongDan(ten, do_an, map.get(ma)));
            }
        }

        Collections.sort(ls, (x, y) -> {
            return x.sv.ma.compareTo(y.sv.ma);
        });

        for (HuongDan x : ls) {
            System.out.println(x);
        }
    }
}
