import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    private static int[] cnt = new int[100005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++) {
            System.out.printf("Test %d:\n", test);
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            for(int i = 0; i < n; i++) {
                if(cnt[a[i]] != 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[i], cnt[a[i]]);
                    cnt[a[i]] = 0;
                }
            }
        }
        sc.close();
    }
}
