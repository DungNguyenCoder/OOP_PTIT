import java.util.Scanner;

public class J04006_KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        System.out.printf("B20DCCN001 ");
        System.out.println(sv);
        sc.close();
    }
}

class SinhVien {
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public SinhVien(String hoTen, String lop, String ngaySinh, double gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String ChuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
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
        return this.hoTen + " " + this.lop + " " + ChuanHoaNgaySinh() + " " + String.format("%.2f", this.gpa);
    }
}

