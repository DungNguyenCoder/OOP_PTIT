import java.util.Scanner;

public class J04007_KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
    }
}

class NhanVien {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maSoThue;
    private String ngayKiHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHopDong = ngayKiHopDong;
    }

    private String ChuanHoaNgayThang(String date) {
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(2) != '/') {
            sb.insert(0, '0');
        }
        if(sb.charAt(5) != '/') {
            sb.insert(3, '0');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "00001 " + this.hoTen + " " + this.gioiTinh + " " + ChuanHoaNgayThang(this.ngaySinh) + " " + this.diaChi + " " + this.maSoThue + " " + ChuanHoaNgayThang(ngayKiHopDong);
    }
}