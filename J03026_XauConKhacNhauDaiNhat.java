import java.util.Scanner;

public class J03026_XauConKhacNhauDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String A = sc.nextLine().trim();
            String B = sc.nextLine().trim();

            if (A.equals(B)) {
                System.out.println(-1);
            } else {
                System.out.println(Math.max(A.length(), B.length()));
            }
        }
        sc.close();
    }
}
