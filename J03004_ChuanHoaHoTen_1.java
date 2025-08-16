import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J03004_ChuanHoaHoTen_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            st = new StringTokenizer(br.readLine().trim());
            while(st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase();
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                sb.append(word).append(" ");
            }
            sb.setLength(sb.length() - 1);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
