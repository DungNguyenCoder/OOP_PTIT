import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03040_BienSoDep {
    private static boolean check1(StringBuilder str) {
        int n = str.length();
        char c = str.charAt(0);
        for(int i = 1; i < n; i++) {
            if(str.charAt(i - 1) >= str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean check2(StringBuilder str) {
        int n = str.length();
        char c = str.charAt(0);
        for(int i = 1; i < 3; i++) {
            if(str.charAt(i) != c) {
                return false;
            }
        }
        if(str.charAt(n - 1) != str.charAt(n - 2)) {
            return false;
        }
        return true;
    }

    private static boolean check3(StringBuilder str) {
        int n = str.length();
        char c = str.charAt(0);
        for(int i = 1; i < n; i++) {
            if(str.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }

    private static boolean check4(StringBuilder str) {
        int n = str.length();
        for (char c : str.toString().toCharArray()) {
            if(c != '6' && c != '8')
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringBuilder s = new StringBuilder(br.readLine().trim().substring(5));
            s.deleteCharAt(3);
            if(check1(s) || check2(s) || check3(s) || check4(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
