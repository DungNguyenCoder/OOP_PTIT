import java.util.Scanner;

public class J02022_SoXaCach {
    private static int[] x = new int[10];
    private static int[] ok = new int[10];
    private static int n;

    private static void Try(int i) {
        for(int j = 1; j <= n; j++) {
            if(ok[j] == 0) {
                x[i] = j;
                ok[j] = 1;
                if(i == n) {
                    boolean flag = true;
                    for(int k = 2; k <= n; k++) {
                        if(Math.abs(x[k - 1] - x[k]) == 1) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        for(int k = 1; k <= n; k++) {
                            System.out.printf("%d", x[k]);
                        }
                        System.out.println();
                    }
                }
                else
                    Try(i + 1);
                ok[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            n = sc.nextInt();
            Try(1);
            System.out.println();
        }
        sc.close();
    }
}
