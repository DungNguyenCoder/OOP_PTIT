import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class J07022_LoaiBoSoNguyen {
    private static boolean isInt(String s) {
        try {
            long val = Long.parseLong(s);
            return val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("DATA.in"))) {
            String line;
            while((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    if(!isInt(s)) {
                        list.add(s);
                    }
                }
            }

        }
        Collections.sort(list);
        for(String s : list) {
            System.out.printf("%s ", s);
        }
    }
}
