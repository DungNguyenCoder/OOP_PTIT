import java.util.Scanner;

public class J04004_TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo1 ps1 = new PhanSo1(sc.nextLong(), sc.nextLong());
        PhanSo1 ps2 = new PhanSo1(sc.nextLong(), sc.nextLong());
        PhanSo1 ans;
        ans = ps1.Sum(ps2);
        System.out.println(ans);
        sc.close();
    }
}

class PhanSo1 {
    private long tu;
    private long mau;

    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public PhanSo1(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo1 Sum(PhanSo1 other) {
        PhanSo1 sum = new PhanSo1(1, 1);
        sum.tu = this.tu * other.mau + other.tu * this.mau;
        sum.mau = this.mau * other.mau;
        long k = gcd(sum.tu, sum.mau);
        sum.tu = sum.tu / k;
        sum.mau = sum.mau / k;
        return sum;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
