import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a == 0) {
            if(b == 0) {
                System.out.println("VSN");
            }
            else {
                System.out.println("VN");
            }
        }
        else {
            double ans = -(double)b / a;
            System.out.printf("%.2f", ans);
        }
    }
}
