import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class J03010_DiaChiEmail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while(t-- > 0) {
            StringBuilder email = new StringBuilder();
            st = new StringTokenizer(br.readLine().trim());
            ArrayList<String> list = new ArrayList<String>();
            while(st.hasMoreTokens()) {
                String word = st.nextToken().toLowerCase();
                list.add(word);
            }
            email.append(list.get(list.size() - 1));
            for(int i = 0; i < list.size() - 1; i++) {
                email.append(list.get(i).charAt(0));
            }
            String base = email.toString();
            if(!map.containsKey(base)) {
                map.put(base, 1);
                sb.append(base).append("@ptit.edu.vn\n");
            }
            else {
                int count = map.get(base);
                sb.append(base).append(count + 1).append("@ptit.edu.vn\n");
                map.put(base, count + 1);
            }
        }
        System.out.print(sb);
    }
}


