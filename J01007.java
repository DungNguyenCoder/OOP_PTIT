import java.util.Scanner;

public class J01007 {
    private static long[] f = new long[100];

    private static void fibo() {
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <= 92; i++) {
            f[i] = f[i-1] + f[i-2];
        }
    }

    public static void main(String[] args) {
        fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            boolean check = false;
            for(long x : f) {
                if(x == n) {
                    System.out.println("YES");
                    check = true;
                    break;
                }
                else if(x > n) {
                    break;
                }
            }
            if(!check) {
                System.out.println("NO");
            }
        }
    }
}
