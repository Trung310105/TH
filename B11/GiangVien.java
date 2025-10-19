
import java.util.Locale;

public class GiangVien {

    String ma, ten;
    double tg = 0;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public void setTg(double tg) {
        this.tg += tg;
    }

    public String toString() {
        return this.ten + " " + String.format(Locale.US, "%.2f", this.tg);
    }
}
