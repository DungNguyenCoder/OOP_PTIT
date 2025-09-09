import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.StringTokenizer;

public class J07021_ChuanHoaHoTenTrongFile {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("DATA.in"))) {
            String line;
            while (!Objects.equals(line = br.readLine(), "END")) {
                StringTokenizer st = new StringTokenizer(line);
                StringBuilder ans = new StringBuilder();
                while (st.hasMoreTokens()) {
                    StringBuilder word = new StringBuilder(st.nextToken().toString().toLowerCase());
                    word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
                    ans.append(word + " ");
                }
                ans.deleteCharAt(ans.length() - 1);
                System.out.println(ans);
            }
        }
    }
}
