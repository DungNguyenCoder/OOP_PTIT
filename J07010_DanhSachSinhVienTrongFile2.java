import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class J07010_DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws IOException {
        List<SV> sv = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            int t = Integer.parseInt(br.readLine());
            for(int test = 1; test <= t; test++) {
                SV sv1 = new SV(br.readLine(), br.readLine(), br.readLine(), Double.parseDouble(br.readLine()));
                sv1.SetMSV(String.format("B20DCCN%03d", test));
                sv.add(sv1);
            }
        }
        for(SV data : sv) {
            System.out.println(data);
        }
    }
}

class SV {
    private String msv;
    private String name;
    private String Class;
    private String birthDay;
    private double gpa;

    public SV(String name, String Class, String birthDay, double gpa) {
        this.name = name;
        this.Class = Class;
        this.birthDay = birthDay;
        this.gpa = gpa;
    }

    public void SetMSV(String msv) {
        this.msv = msv;
    }

    public String ChuanHoaNgaySinh() {
        StringBuilder sb = new StringBuilder(this.birthDay);
        if(sb.charAt(2) != '/') {
            sb.insert(0, '0');
        }
        if(sb.charAt(5) != '/') {
            sb.insert(3, '0');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return this.msv + " " + this.name + " " + this.Class + " " + ChuanHoaNgaySinh() + " " + String.format("%.2f", this.gpa);
    }
}