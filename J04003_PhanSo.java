import java.util.Scanner;

public class J04003_PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo ps = new PhanSo(a, b);
        ps.ToiGian();
        System.out.println(ps);
        sc.close();
    }
}

class PhanSo {
    private long tu;
    private long mau;

    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void ToiGian() {
        long GCD = gcd(this.tu, this.mau);
        this.tu /= GCD;
        this.mau /= GCD;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}

