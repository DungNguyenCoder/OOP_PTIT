import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    private static long gcd(long a, long b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static long find(String b, long a) {
        long res = 0;
        for(int i = 0; i < b.length(); i++) {
            res = (res * 10) + b.charAt(i) - '0';
            res %= a;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            long a = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine().trim());
            String b = st.nextToken();
            long du = find(b, a);
            long ans = gcd(a, du);
            System.out.println(ans);
        }
    }
}
