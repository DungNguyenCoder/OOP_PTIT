import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class J07034_DanhSachMonHoc {
    private static int cmp(MonHoc_J07034 a, MonHoc_J07034 b) {
        return a.getTenMon().compareTo(b.getTenMon());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<MonHoc_J07034> monHocs = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String maMon = br.readLine();
            String tenMon = br.readLine();
            int soTinChi = Integer.parseInt(br.readLine());
            MonHoc_J07034 monHoc = new MonHoc_J07034(maMon, tenMon, soTinChi);
            monHocs.add(monHoc);
        }
        monHocs.sort(J07034_DanhSachMonHoc::cmp);
        for (MonHoc_J07034 monHoc : monHocs) {
            System.out.println(monHoc);
        }
    }
}
class MonHoc_J07034 {
    private String maMon;
    private String tenMon;
    private int soTinChi;

    public MonHoc_J07034(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getTenMon() {
        return tenMon;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi;
    }
}
