import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dai = sc.nextInt();
        int rong = sc.nextInt();
        sc.close();
        if(dai <= 0 || rong <= 0) {
            System.out.println("0");
        }
        else {
            int s = dai * rong;
            int c = (dai + rong) * 2;
            System.out.println(c + " " + s);
        }
    }
}
