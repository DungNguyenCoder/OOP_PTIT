import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07052_DanhSachTrungTuyen {
    private static int cmp(J07052_ThiSinh a, J07052_ThiSinh b) {
        return a.getTongDiem() > b.getTongDiem() ? -1 : 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("THISINH.in"));
        List<J07052_ThiSinh> ds = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String mts = br.readLine();
            String name = br.readLine();
            double maths = Double.parseDouble(br.readLine());
            double physics = Double.parseDouble(br.readLine());
            double chemistry = Double.parseDouble(br.readLine());
            J07052_ThiSinh thiSinh = new J07052_ThiSinh(mts, name, maths, physics, chemistry);
            ds.add(thiSinh);
        }
        int chiTieu = Integer.parseInt(br.readLine());
        ds.sort(J07052_DanhSachTrungTuyen::cmp);
        double diemChuanChiTieu = ds.get(chiTieu - 1).getTongDiem();
        System.out.println(String.format("%.1f", diemChuanChiTieu));
        for(J07052_ThiSinh thiSinh : ds) {
            if(thiSinh.getTongDiem() >= diemChuanChiTieu) {
                thiSinh.setTrangThai("TRUNG TUYEN");
            }
            else {
                thiSinh.setTrangThai("TRUOT");
            }
            System.out.println(thiSinh);
        }
    }
}

class J07052_ThiSinh {
    private String mts;
    private String name;
    private double maths;
    private double physics;
    private double chemistry;
    private double tongDiem;
    private String trangThai;
    private double diemUuTien;

    public J07052_ThiSinh(String mts, String name, double maths, double physics, double chemistry) {
        this.mts = mts;
        this.name = ChuanHoaTen(name);
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.diemUuTien = getDiemUuTien();
        this.tongDiem = maths * 2 + physics + chemistry + getDiemUuTien();
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

    private double getDiemUuTien() {
        String tmp = this.mts.substring(0, 3);
        if(tmp.equals("KV1")) {
            return 0.5;
        }
        else if (tmp.equals("KV2")) {
            return 1.0;
        }
        else {
            return 2.5;
        }
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public double getTongDiem() {
        return tongDiem;
    }

    @Override
    public String toString() {
        String tmp = "";
        if((this.tongDiem * 10) % 10 == 0) {
            tmp = String.format("%.0f", this.tongDiem);
        }
        else {
            tmp = String.format("%.1f", this.tongDiem);
        }
        String tmp2 = "";
        if((this.diemUuTien * 10) % 10 == 0) {
            tmp2 = String.format("%.0f", this.diemUuTien);
        }
        else {
            tmp2 = String.format("%.1f", this.diemUuTien);
        }
        return this.mts + " " + this.name + " " + tmp2 + " " + tmp + " " + this.trangThai;
    }
}