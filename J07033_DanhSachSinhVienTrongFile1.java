import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07033_DanhSachSinhVienTrongFile1 {
    private static int cmp(SinhVienJ07033 a, SinhVienJ07033 b) {
        return a.getMSV().compareTo(b.getMSV());
    }

    public static void main(String[] args) throws IOException {
        List<SinhVienJ07033> list = new ArrayList<SinhVienJ07033>();
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String MSV = br.readLine();
            String name = br.readLine();
            String classes = br.readLine();
            String email = br.readLine();
            SinhVienJ07033 sv = new SinhVienJ07033(MSV, name, classes, email);
            list.add(sv);
        }
        list.sort(J07033_DanhSachSinhVienTrongFile1::cmp);
        for (SinhVienJ07033 sv : list) {
            System.out.println(sv);
        }
    }
}

class SinhVienJ07033 {
    private String MSV;
    private String name;
    private String classes;
    private String email;

    public SinhVienJ07033(String MSV, String name, String classes, String email) {
        this.MSV = MSV;
        this.name = name;
        this.classes = classes;
        this.email = email;
    }

    private String ChuanHoaTen() {
        StringTokenizer st = new StringTokenizer(name);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase();
            StringBuilder Word = new StringBuilder(word);
            Word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            sb.append(Word + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

   @Override
    public String toString() {
        return this.MSV + " " + ChuanHoaTen() + " " + this.classes + " " + this.email;
   }

   public String getMSV() {
        return MSV;
   }
}
