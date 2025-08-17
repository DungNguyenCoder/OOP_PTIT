import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J03013_HieuSoNguyenLon_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.compareTo(b) < 0) {
                BigInteger temp = a;
                a = b;
                b = temp;
            }
            BigInteger ans = a.subtract(b);
            int print0 = a.toString().length() - ans.toString().length();
            while(print0 > 0) {
                System.out.printf("0");
                print0--;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}