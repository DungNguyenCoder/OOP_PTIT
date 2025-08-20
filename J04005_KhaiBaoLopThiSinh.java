import java.util.Scanner;

public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println(thiSinh);
        sc.close();
    }
}

class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private double diem1;
    private double diem2;
    private double diem3;

    public ThiSinh(String hoTen, String ngaySinh, double diem1, double diem2, double diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public double TongDiem() {
        double tongDiem = this.diem1 + this.diem2 + this.diem3;
        return tongDiem;
    }

    @Override
    public String toString() {
        return this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f", this.TongDiem());
    }
}