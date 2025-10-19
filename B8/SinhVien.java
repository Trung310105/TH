
public class SinhVien {

    public String ma, ten, lop, email, sdt, gt;
    private String size;

    public SinhVien(String ma, String ten, String lop, String email, String sdt, String gt) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gt = gt;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email + " " + this.sdt;
    }

    public String getSize() {
        return size;
    }
}
