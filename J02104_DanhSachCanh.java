import java.util.ArrayList;
import java.util.Scanner;

public class J02104_DanhSachCanh {

    static class Pair<U, V> {
        public U first;
        public V second;
        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + "," + second + ")";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] a = new Pair[n * (n - 1) / 2 + 5];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if(i < j && tmp == 1) {
                    a[idx++] = new Pair<>(i + 1, j + 1);
                }
            }
        }
        for(int i = 0; i < idx; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }
}

