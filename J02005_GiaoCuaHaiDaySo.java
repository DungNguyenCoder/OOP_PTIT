import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class J02005_GiaoCuaHaiDaySo {
    private static int[] cnt = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp;
        for(int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            cnt[tmp] = 1;
        }
        for(int i = 0; i < m; i++) {
            tmp = sc.nextInt();
            if(cnt[tmp] == 1) {
                cnt[tmp] = 2;
            }
        }
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == 2) {
                System.out.printf("%d ", i);;
            }
        }
        sc.close();
    }
}
