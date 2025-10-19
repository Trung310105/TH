
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static String ChuanHoa(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toUpperCase(s.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));

        int n = Integer.parseInt(sc.nextLine());

        HashMap<String, SinhVien> map = new HashMap<>();
        ArrayList<SinhVien> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            String gt = sc.nextLine();
            SinhVien sv = new SinhVien(ma, ten, lop, email, sdt, gt);
            map.put(ma, sv);
            ls.add(sv);
        }

        Collections.sort(ls, (x, y) -> {
            return x.ma.compareTo(y.ma);
        });

        sc.close();
        sc = new Scanner(new File("DANGKY.in"));
        while (true) {
            if (!sc.hasNextLine()) {
                break;
            }
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            map.get(arr[0]).setSize(arr[1]);
        }

        sc.close();

        sc = new Scanner(new File("TRUYVAN.in"));
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            System.out.println("DANH SACH SINH VIEN " + ChuanHoa(arr[0]) + " DANG KY SIZE " + arr[1]);
            for (SinhVien x : ls) {
                if (x.gt.equals(arr[0]) && x.getSize().equals(arr[1])) {
                    System.out.println(x);
                }
            }
        }
    }
}
