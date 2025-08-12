import java.util.Scanner;

public class J01011 {

    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            long GCD = gcd(a, b);
            long LCM = a / gcd(a, b) * b;
            System.out.println(LCM + " " + GCD);
        }
        sc.close();
    }
}
