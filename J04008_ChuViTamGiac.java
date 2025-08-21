import java.util.Scanner;

public class J04008_ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            Point1 p1 = new Point1(sc.nextDouble(), sc.nextDouble());
            Point1 p2 = new Point1(sc.nextDouble(), sc.nextDouble());
            Point1 p3 = new Point1(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p2.distance(p3);
            if(a + b > c && b + c > a && a + c > b) {
                double ans = a + b + c;
                System.out.printf("%.3f\n", ans);
            }
            else {
                System.out.println("INVALID");
            }
        }
        sc.close();
    }
}

class Point1 {
    private double x;
    private double y;

    public Point1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point1 other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
