import java.util.Arrays;
import java.util.Scanner;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = a.clone();
        Arrays.sort(b);
        for(int i = 0; i < n - 1; i++) {
            System.out.printf("Buoc %d: ", i + 1);
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            for(int j = 0; j < n; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
            if(Arrays.equals(a, b)) {
                break;
            }
        }
        sc.close();
    }
}
