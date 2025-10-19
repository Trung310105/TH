
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));

        int n_sp = Integer.parseInt(sc.nextLine());
        HashMap<String, SanPham> spMap = new HashMap<>();

        for (int i = 0; i < n_sp; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long gia = Long.parseLong(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            spMap.put(ma, new SanPham(ma, ten, gia, bh));
        }

        int n_kh = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();

        for (int i = 0; i < n_kh; i++) {
            String ten = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSP = sc.nextLine();
            long sl = Long.parseLong(sc.nextLine());
            String ngayMua = sc.nextLine();
            ds.add(new KhachHang(ten, diaChi, maSP, sl, ngayMua, spMap.get(maSP)));
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Collections.sort(ds, (a, b) -> {
            try {
                int cmp = sdf.parse(a.ngayHetHan).compareTo(sdf.parse(b.ngayHetHan));
                if (cmp != 0) {
                    return cmp;
                }
                return a.maKH.compareTo(b.maKH);
            } catch (Exception e) {
                return 0;
            }
        });

        for (KhachHang kh : ds) {
            System.out.println(kh);
        }
    }
}
