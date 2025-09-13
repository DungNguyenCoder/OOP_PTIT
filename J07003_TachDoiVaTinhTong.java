import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class J07003_TachDoiVaTinhTong {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            String s;
            s = br.readLine().trim();
            while(s.length() != 1) {
                String a = s.substring(0, s.length()/2);
                String b = s.substring(s.length()/2);
                BigInteger b1 = new BigInteger(a);
                BigInteger b2 = new BigInteger(b);
                BigInteger c = b1.add(b2);
                s = c.toString();
                System.out.println(s);
            }
        }
    }
}
