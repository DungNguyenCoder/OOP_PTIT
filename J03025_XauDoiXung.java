import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03025_XauDoiXung {
    private static boolean tn(String s) {
        int cnt = 0;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                ++cnt;
                if(cnt > 1) {
                    return false;
                }
            }
            ++l;
            --r;
        }
        if(s.length() % 2 == 0) {
            return cnt == 1;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            String a = st.nextToken();
            if(tn(a)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
