import java.util.Scanner;

public class J01025_HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        int x3, y3, x4, y4;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        int minXLeft = Math.min(x1, x3);
        int minYLeft = Math.min(y1, y3);
        int maxXRight = Math.max(x2, x4);
        int maxYRight = Math.max(y2, y4);
        int maxX = maxXRight - minXLeft;
        int maxY = maxYRight - minYLeft;
        int maxLength = Math.max(maxX, maxY);
        int ans = maxLength * maxLength;
        System.out.println(ans);
        sc.close();
    }
}
