import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07053_XetTuyen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("XETTUYEN.in"));
        List<XetTuyen_J07053> ds = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String name = br.readLine();
            String birth = br.readLine();
            double lyThuyet = Double.parseDouble(br.readLine());
            double thucHanh = Double.parseDouble(br.readLine());
            XetTuyen_J07053 thiSinh = new XetTuyen_J07053(name, birth, lyThuyet, thucHanh);
            thiSinh.setMts("PH" + String.format("%02d", i + 1));
            ds.add(thiSinh);
        }
        for(XetTuyen_J07053 d : ds) {
            System.out.println(d);
        }

    }
}

class XetTuyen_J07053 {
    private String mts;
    private String name;
    private String birthday;
    private double lyThuyet;
    private double thucHanh;
    private int tuoi;
    private int diemTrungBinh;
    private String xepLoai;

    public XetTuyen_J07053(String name, String birthday, double lyThuyet, double thucHanh) {
        this.name = ChuanHoaTen(name);
        this.birthday = birthday;
        this.lyThuyet = lyThuyet;
        this.thucHanh = thucHanh;
        this.diemTrungBinh = (int)Math.round(TongDiem());
        this.xepLoai = getXepLoai();
        this.tuoi = SoTuoi();
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
        double ans = (this.lyThuyet + this.thucHanh) / 2;
        if(this.lyThuyet >= 8 && this.thucHanh >= 8 && ans < 10) {
            ans += 1;
        }
        else if(this.lyThuyet >= 7.5 && this.thucHanh >= 7.5 && ans < 10) {
            ans += 0.5;
        }
        return ans;
    }

    private String getXepLoai() {
        if(this.diemTrungBinh >= 9)
            return "Xuat sac";
        else if(this.diemTrungBinh == 8)
            return "Gioi";
        else if(this.diemTrungBinh == 7)
            return "Kha";
        else if(this.diemTrungBinh >= 5)
            return "Trung binh";
        else
            return "Truot";
    }

    private int SoTuoi() {
        String tmp = this.birthday.substring(this.birthday.length() - 4);
        int ans = 2021 - Integer.parseInt(tmp);
        return ans;
    }

    public void setMts(String mts) {
        this.mts = mts;
    }

    private String formatNumber(double x) {
        if(x == (long)x)
            return String.format("%d", (long) x);
        else
            return String.format("%.1f", x);
    }

    @Override
    public String toString() {
        return this.mts + " " + this.name + " " + this.tuoi + " " + this.diemTrungBinh + " " + this.xepLoai;
    }
}
