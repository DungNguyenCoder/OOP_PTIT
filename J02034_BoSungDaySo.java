import java.util.ArrayList;
import java.util.Scanner;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[205];
        int[] a = new int[n];
        int maxx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            maxx = Math.max(maxx, a[i]);
            cnt[a[i]]++;
        }
        boolean flag = true;
        for(int i = 1; i <= maxx; i++) {
            if(cnt[i] == 0) {
                flag = false;
                System.out.println(i);
            }
        }
        if(flag) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
