import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class J07002_TinhTong {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            String line;
            long sum = 0;
            while ((line = br.readLine()) != null) {
                StringTokenizer st;
                st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    String tmp = st.nextToken();
                    boolean flag = true;
                    for (int i = 0; i < tmp.length(); i++) {
                        char ch = tmp.charAt(i);
                        if(!Character.isDigit(ch)) {
                            flag = false;
                            break;
                        }
                    }
                    if(flag) {
                        try {
                            int val = Integer.parseInt(tmp);
                            sum += val;
                        }
                        catch(NumberFormatException e) {}
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
