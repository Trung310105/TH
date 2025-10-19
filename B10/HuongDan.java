
public class HuongDan {

    String ten, do_an;
    SinhVien sv;

    public HuongDan(String ten, String do_an, SinhVien sv) {
        this.ten = ten;
        this.do_an = do_an;
        this.sv = sv;
    }

    public String toString() {
        return this.sv.ma + " " + this.sv.ten + " " + this.ten + " " + this.do_an + " " + this.sv.sdt;
    }
}
