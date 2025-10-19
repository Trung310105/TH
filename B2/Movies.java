
public class Movies {

    String ma, the_loai, ngay, ten;
    int tap;
    public static int cnt = 0;

    public Movies(String the_loai, String ngay, String ten, int tap) {
        cnt++;
        this.ma = String.format("P%03d", cnt);
        this.the_loai = the_loai;
        this.ngay = ngay;
        this.ten = ten;
        this.tap = tap;
    }

    public String toString() {
        return this.ma + " " + this.the_loai + " " + this.ngay + " " + this.ten + " " + this.tap;
    }
}
