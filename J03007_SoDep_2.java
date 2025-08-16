import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03007_SoDep_2 {
    private static boolean check(String s) {
        if(s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
        }
        int sum = 0;
        int l = 0;
        int r = s.length() - 1;
        while (l <= r) {
            sum += (s.charAt(l) - '0') * 2;
            if(l == r) {
                sum -= (s.charAt(r) - '0');
            }
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            ++l;
            --r;
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine().trim();
            if(check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}