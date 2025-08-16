import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class J03005_ChuanHoaHoTen_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        while (t-- > 0) {
            list.clear();
            st = new StringTokenizer(br.readLine().trim());
            while (st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase();
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                list.add(word);
            }
            String word = list.get(0).toUpperCase();
            list.add(word);
            for(int i = 1; i < list.size() - 1; i++) {
                sb.append(list.get(i)).append(" ");
            }
            sb.setLength(sb.length() - 1);
            sb.append(", ").append(list.get(list.size() - 1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
