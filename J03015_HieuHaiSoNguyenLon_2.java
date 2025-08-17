import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HieuHaiSoNguyenLon_2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.subtract(b);
        System.out.println(c);
        sc.close();
    }
}
