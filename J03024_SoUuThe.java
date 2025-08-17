import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03024_SoUuThe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            boolean flag = true;
            String a = st.nextToken();
            int n = a.length();
            int cntEven = 0;
            for(int i = 0; i < n; i++) {
                char c = a.charAt(i);
                if((i == 0 && c == '0') || Character.isLetter(c)) {
                    flag = false;
                    break;
                }
                if((c - '0') % 2 == 0) {
                    cntEven++;
                }
            }
            int cntOdd = n - cntEven;
            if(flag) {
                if((n % 2 == 0 && cntEven > cntOdd) || (n % 2 == 1 && cntEven < cntOdd)) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("INVALID");
            }
        }
    }
}
