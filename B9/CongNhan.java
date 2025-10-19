
public class CongNhan {

    String ma, ten, gio_vao, gio_ra;
    int tgian, gio, phut;
    String trang_thai;

    public CongNhan(String ma, String ten, String gio_vao, String gio_ra) {
        this.ma = ma;
        this.ten = ten;

        String[] vao = gio_vao.split(":");
        String[] ra = gio_ra.split(":");

        int h_vao = Integer.parseInt(vao[0]);
        int m_vao = Integer.parseInt(vao[1]);
        int h_ra = Integer.parseInt(ra[0]);
        int m_ra = Integer.parseInt(ra[1]);

        this.tgian = h_ra * 60 + m_ra - (h_vao * 60 + m_vao) - 60;
        if (this.tgian < 0) {
            this.tgian = 0;
        }
        this.gio = this.tgian / 60;
        this.phut = this.tgian % 60;
        if (this.tgian >= (8 * 60)) {
            this.trang_thai = "DU";
        } else {
            this.trang_thai = "THIEU";
        }
    }

    public String toString() {
        return this.ma + " " + this.ten + " " + this.gio + " gio " + this.phut + " phut " + this.trang_thai;
    }
}
