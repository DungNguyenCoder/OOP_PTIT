import java.util.Scanner;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int cnt = 0;
            int n = sc.nextInt();
            if(n % 2 == 0)
                ++cnt;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    if(i % 2 == 0) {
                        ++cnt;
                    }
                    if(n/i != i && (n/i) % 2 == 0) {
                        ++cnt;
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
