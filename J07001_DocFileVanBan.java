import java.io.*;

public class J07001_DocFileVanBan {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}