import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            double h = sc.nextDouble();
            for(int i = 1; i < n; i++) {
                double hi = h * Math.sqrt((double) i / n);
                System.out.printf("%.6f ", hi);
            }
            System.out.println();
        }
        sc.close();
    }
}
