import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("DATA.in"))) {
            TreeMap<Integer, Integer> mp = new TreeMap<>();
            String line;
            while((line = br.readLine()) != null) {
                int num;
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()) {
                    num = Integer.parseInt(st.nextToken());
                    mp.put(num, mp.getOrDefault(num, 0) + 1);
                }
            }
            for(Integer key : mp.keySet()) {
                System.out.println(key + " " + mp.get(key));
            }
        }
    }
}
