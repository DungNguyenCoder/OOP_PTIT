import java.util.Scanner;

public class J02021_LietKeToHop_2 {
    private static int[] x = new int[100];
    private static int n;
    private static int k;
    private static int cnt = 0;

    private static void in() {
        ++cnt;
        for(int i = 1; i <= k; i++) {
            System.out.printf("%d", x[i]);
        }
    }

    private static void Try(int i) {
        for(int j = x[i - 1] + 1; j <= n - k + i; j++) {
            x[i] = j;
            if(i == k) {
                in();
                System.out.printf(" ");
            }
            else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        sc.close();
        Try(1);
        System.out.println();
        System.out.printf("Tong cong co %d to hop", cnt);
    }
}
