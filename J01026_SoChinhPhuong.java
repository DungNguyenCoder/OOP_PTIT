import java.util.Scanner;

public class J01026_SoChinhPhuong {

    private static boolean KTSoChinhPhuong(int n) {
        int a = (int)Math.sqrt(n);
        return a * a == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(KTSoChinhPhuong(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
