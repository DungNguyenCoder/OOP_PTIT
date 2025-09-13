import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class J07007_LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Integer> mp = new TreeMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            String line;
            while((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()) {
                    String word = st.nextToken();
                    word = word.toLowerCase();
                    mp.put(word, mp.getOrDefault(word, 0) + 1);
                }
            }
        }
        for(String word : mp.keySet()) {
            System.out.println(word);
        }
    }
}
