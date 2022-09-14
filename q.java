public class q {
    int congSuat;
    int capDo;
    String loai;
    String ThuongHieu;
    float gia;
    boolean quay_ngang;

    public q(String loai, String ThuongHieu, int congSuat, float gia) {
        this.loai = loai;
        this.ThuongHieu = ThuongHieu;
        this.congSuat = congSuat;
        this.capDo = 0;
        this.gia = gia;
    }

    void chuyenSo(int So) {
        this.capDo +=So;
        System.out.println("quat chuyen so "+this.capDo);
    }

    void chuyentrangthaiquay() {
        if (this.quay_ngang) {
            this.quay_ngang = false;
            System.out.println("quat quay ngang");
        } else {
            System.out.println("quat ko quay ngang");
        }
    }

    public void bat() {
        System.out.println("bat quat len ");
    }

    public void tat() {
        System.out.println("tat quat di ");
    }

    public void hienthi() {
        System.out.println(" quat" + this.ThuongHieu + this.loai + this.gia);
    }

    public static void main(String[] args) {
        q senko1 = new q("senko", "VIETNAM", 2000, 10000);
        q samsung2 = new q("samsung", "HANQUOC", 3000, 20000);
        senko1.hienthi();
        samsung2.hienthi();
        senko1.bat();
        samsung2.tat();
        senko1.chuyenSo(2);
        samsung2.chuyenSo(3);

    }
}
