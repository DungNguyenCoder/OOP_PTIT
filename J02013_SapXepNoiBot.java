import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class J02013_SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = a.clone();
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            for(int j = 1; j < n; j++){
                if(a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            System.out.printf("Buoc %d: ", i + 1);
            for(int j = 0; j < n; j++){
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
