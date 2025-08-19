import java.util.Scanner;
import java.util.StringTokenizer;

public class J04002_KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        String C = st.nextToken();
        if(A <= 0f || B <= 0f) {
            System.out.println("INVALID");
        }
        else {
            Rectangle a = new Rectangle(A, B, C);
            double c = a.findC();
            double s = a.findS();
            String color = a.findColor();
            System.out.printf("%.0f %.0f %s", c, s, color);
        }
    }
}

class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double findC() {
        double ans = (this.width + this.height) * 2;
        return ans;
    }

    public double findS() {
        double ans = this.height * this.width;
        return ans;
    }

    public String findColor() {
        StringBuilder s = new StringBuilder(this.color.toLowerCase());
        s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
        return s.toString();
    }
}
