import java.util.Scanner;
import java.util.TreeSet;

public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < n + m; i++) {
            set.add(sc.nextInt());
        }
        for(Integer x : set) {
            System.out.printf("%d ", x);
        }
        sc.close();
    }
}
