import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class J03039_ChiaHet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            if(a.remainder(b).equals(BigInteger.ZERO) || b.remainder(a).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
