import java.util.Scanner;

public class J01021_TinhLuyThua {
    private static final int mod = 1000000007;

    private static long binpow(long a, long b) {
        long ans = 1;
        a %= mod;
        while(b != 0) {
            if((b & 1) != 0) {
                ans = (ans * a) % mod;
            }
            b >>= 1;
            a = (a * a) % mod;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 1, b = 1;
        while(true) {
            a = sc.nextLong();
            b = sc.nextLong();
            if(a == 0 && b == 0) break;
            long ans = binpow(a,b);
            System.out.println(ans);
        }
    }
}
