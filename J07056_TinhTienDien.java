import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07056_TinhTienDien {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<TienDien_J07056> ds     = new ArrayList<TienDien_J07056>();
        int t = Integer.parseInt(br.readLine());
        for(int test = 0; test < t; test++) {
            String mkh =  "KH" + String.format("%02d", test + 1);
            String ten = br.readLine();
            StringTokenizer line = new StringTokenizer(br.readLine());
            char loaiGiaDinh = 'A';
            int chiSoDau = 0;
            int chiSoCuoi = 0;
            while (line.hasMoreTokens()) {
                loaiGiaDinh = line.nextToken().charAt(0);
                chiSoDau = Integer.parseInt(line.nextToken());
                chiSoCuoi = Integer.parseInt(line.nextToken());
            }
            TienDien_J07056 giaDinh = new TienDien_J07056(ten, loaiGiaDinh, chiSoDau, chiSoCuoi);
            giaDinh.SetMkh(mkh);
            ds.add(giaDinh);
        }

        for(TienDien_J07056 d : ds) {
            System.out.println(d);
        }
    }
}

class TienDien_J07056 {
    private String mkh;
    private String ten;
    private char loaiGiaDinh;
    private int chiSoDau;
    private int chiSoCuoi;
    private int tien;
    private int tienDinhMuc;
    private int tienVuotMuc;
    private int tienNop;
    private int VAT;

    public TienDien_J07056(String ten, char loaiGiaDinh, int chiSoDau, int chiSoCuoi) {
        this.ten = ChuanHoaTen(ten);
        this.loaiGiaDinh = loaiGiaDinh;
        this.chiSoDau = chiSoDau;
        this.chiSoCuoi = chiSoCuoi;
        this.tien = this.chiSoCuoi - this.chiSoDau;
        CalTien();
        this.tienNop = this.tienDinhMuc + this.tienVuotMuc + this.VAT;
    }

    private void CalTien() {
        char[] loaiGiaDinh = {'A', 'B', 'C'};
        char[] dinhMuc = {100, 500, 200};
        for(int i = 0; i < 3; i++) {
            if(this.loaiGiaDinh == loaiGiaDinh[i]) {
                if(this.tien <= dinhMuc[i]) {
                    this.tienDinhMuc = this.tien * 450;
                    this.tienVuotMuc = 0;
                    this.VAT = 0;
                }
                else {
                    this.tienDinhMuc = dinhMuc[i] * 450;
                    this.tienVuotMuc = (this.tien - dinhMuc[i]) * 1000;
                    this.VAT = (int)(this.tienVuotMuc * 0.05);
                }
            }
        }
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

    public void SetMkh(String mkh) {
        this.mkh = mkh;
    }

    @Override
    public String toString() {
        return this.mkh + " " + this.ten + " " + this.tienDinhMuc + " " + this.tienVuotMuc + " " + this.VAT + " " + this.tienNop;
    }
}

