import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class J07037_DanhSachDoanhNghiep {
    private static int cmp(DN_J07037 a, DN_J07037 b) {
        return a.getMaDoanhNghiep().compareTo(b.getMaDoanhNghiep());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DN.in"));

        List<DN_J07037> doanhNghieps = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String maDoanhNghiep = br.readLine();
            String tenDoanhNghiep = br.readLine();
            int soTinChi = Integer.parseInt(br.readLine());
            DN_J07037 doanhNghiep = new DN_J07037(maDoanhNghiep, tenDoanhNghiep, soTinChi);
            doanhNghieps.add(doanhNghiep);
        }

        doanhNghieps.sort(J07037_DanhSachDoanhNghiep::cmp);

        for (DN_J07037 dn : doanhNghieps) {
            System.out.println(dn);
        }
    }
}

class DN_J07037 {
    private String maDoanhNghiep;
    private String tenDoanhNghiep;
    private int soSinhVien;

    public DN_J07037(String maDoanhNghiep, String tenDoanhNghiep, int soSinhVien) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.soSinhVien = soSinhVien;
    }

    @Override
    public String toString() {
        return maDoanhNghiep + " " + tenDoanhNghiep + " " + soSinhVien;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }
}
