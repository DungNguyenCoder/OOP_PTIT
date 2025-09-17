import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07055_XepLoai {
    private static int cmp(XepLoai_J07055 a, XepLoai_J07055 b) {
        if(a.getDiemTrungBinh() > b.getDiemTrungBinh())
            return -1;
        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("BANGDIEM.in"));
        List<XepLoai_J07055> ds = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String name = br.readLine();
            double lyThuyet = Double.parseDouble(br.readLine());
            double thucHanh = Double.parseDouble(br.readLine());
            double diemThi = Double.parseDouble(br.readLine());
            XepLoai_J07055 thiSinh = new XepLoai_J07055(name, lyThuyet, thucHanh, diemThi);
            thiSinh.setMts("SV" + String.format("%02d", i + 1));
            ds.add(thiSinh);
        }
        ds.sort(J07055_XepLoai::cmp);
        for(XepLoai_J07055 d : ds) {
            System.out.println(d);
        }

    }
}

class XepLoai_J07055 {
    private String mts;
    private String name;
    private double lyThuyet;
    private double thucHanh;
    private double diemThi;
    private double diemTrungBinh;
    private String xepLoai;

    public XepLoai_J07055(String name, double lyThuyet, double thucHanh, double diemThi) {
        this.name = ChuanHoaTen(name);
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.diemThi = diemThi;
        this.diemTrungBinh = TongDiem();
        this.xepLoai = getXepLoai();
    }

    private String ChuanHoaTen(String name) {
        StringTokenizer st = new StringTokenizer(name.trim());
        StringBuilder ans = new StringBuilder();
        while (st.hasMoreTokens()) {
            StringBuilder tmp = new StringBuilder(st.nextToken().toLowerCase());
            tmp.setCharAt(0, Character.toUpperCase(tmp.charAt(0)));
            ans.append(tmp + " ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }

    private double TongDiem() {
        double ans = (this.lyThuyet * 25 + this.thucHanh * 35 + this.diemThi * 40) / 100;
        return ans;
    }

    private String getXepLoai() {
        if(this.diemTrungBinh >= 8.0)
            return "GIOI";
        else if(this.diemTrungBinh >= 6.5)
            return "KHA";
        else if(this.diemTrungBinh >= 5)
            return "TRUNG BINH";
        else
            return "KEM";
    }

    public void setMts(String mts) {
        this.mts = mts;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    @Override
    public String toString() {
        return this.mts + " " + this.name + " " + String.format("%.2f", this.diemTrungBinh) + " " + this.xepLoai;
    }
}
