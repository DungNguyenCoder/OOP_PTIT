import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long ans = 0;
        for(int i = 1; i <= n; i++) {
            long tmp = 1;
            for(int j = 1; j <= i; j++) {
                tmp *= j;
            }
            ans += tmp;
        }
        System.out.println(ans);
    }
}
