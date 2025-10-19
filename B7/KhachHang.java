
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KhachHang {

    static int cnt = 0;
    String maKH, ten, diaChi, maSP, ngayMua, ngayHetHan;
    long soLuong, thanhTien;

    public KhachHang(String ten, String diaChi, String maSP, long soLuong, String ngayMua, SanPham sp) {
        cnt++;
        this.maKH = String.format("KH%02d", cnt);
        this.ten = ten;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.thanhTien = soLuong * sp.gia;
        this.ngayMua = ngayMua;
        this.ngayHetHan = tinhNgayHetHan(ngayMua, sp.baoHanh);
    }

    private String tinhNgayHetHan(String ngayMua, int thangBH) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(sdf.parse(ngayMua));
            cal.add(Calendar.MONTH, thangBH);
            return sdf.format(cal.getTime());
        } catch (Exception e) {
            return ngayMua;
        }
    }

    @Override
    public String toString() {
        return maKH + " " + ten + " " + diaChi + " " + maSP + " " + thanhTien + " " + ngayHetHan;
    }
}
