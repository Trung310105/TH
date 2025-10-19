
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            sc.nextLine();
        }

        sc.close();

        HashMap<String, GiangVien> map = new HashMap<>();
        ArrayList<GiangVien> ls = new ArrayList<>();

        sc = new Scanner(new File("GIANGVIEN.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String ma = s.substring(0, 4);
            String ten = s.substring(5);
            GiangVien gv = new GiangVien(ma, ten);
            map.put(ma, gv);
            ls.add(gv);
        }

        sc.close();
        sc = new Scanner(new File("GIOCHUAN.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            String maGV = arr[0];
            String maMH = arr[1];
            double tg = Double.parseDouble(arr[2]);
            map.get(maGV).setTg(tg);
        }

        for (GiangVien x : ls) {
            System.out.println(x);
        }
    }
}
