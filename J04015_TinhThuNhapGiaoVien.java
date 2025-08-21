import java.util.Scanner;

public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(gv);
        sc.close();
    }
}

class GiaoVien {
    private String mgv;
    private String hoTen;
    private long luongCoBan;
    private long phuCap;
    private long thuNhap;
    private long bacLuong;

    public GiaoVien(String mgv, String hoTen, long luongCoBan) {
        this.mgv = mgv;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.phuCap = PhuCap();
        this.thuNhap = ThuNhap();
        this.bacLuong = BacLuong();
    }

    private long PhuCap() {
        String tmp = this.mgv.substring(0, 2);
        if(tmp.equals("HT"))
            return 2000000;
        else if(tmp.equals("HP"))
            return 900000;
        else {
            return 500000;
        }
    }

    private long BacLuong() {
        String tmp = this.mgv.substring(2, 4);
        return Long.parseLong(tmp);
    }

    private long ThuNhap() {
        return this.luongCoBan * BacLuong() + this.phuCap;
    }

    @Override
    public String toString() {
        return this.mgv + " " + this.hoTen + " " + this.bacLuong + " " + this.phuCap + " " + this.thuNhap;
    }
}
