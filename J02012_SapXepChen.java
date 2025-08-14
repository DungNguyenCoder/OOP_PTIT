import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            System.out.printf("Buoc %d: ", i);
            list.add(a[i]);
            Collections.sort(list);
            for(Integer num : list) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
        sc.close();
    }
}
