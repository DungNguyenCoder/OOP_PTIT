import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class J03033_BoiChungNhoNhat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            BigInteger a = new BigInteger(br.readLine().trim());
            BigInteger b = new BigInteger(br.readLine().trim());
            BigInteger GCD = a.gcd(b);
            BigInteger LCM = a.divide(GCD).multiply(b);
            System.out.println(LCM);
        }
    }
}
