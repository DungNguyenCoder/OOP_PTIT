import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            Point a = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            Point b = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            double ans = a.distance(b);
            System.out.printf("%.4f\n", ans);
        }
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        double dis = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return dis;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
