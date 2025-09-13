import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07051_TinhTienPhong {
    public static int[] giaPhong = {0, 25, 34, 50, 80};

    private static int cmp(TienPhong_J07051 a, TienPhong_J07051 b) {
        return b.getThanhTien() > a.getThanhTien() ? 1 : -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<TienPhong_J07051> list = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String tenKhachHang = br.readLine();
            String soPhong = br.readLine();
            String ngayNhanPhong = br.readLine();
            String ngayTraPhong = br.readLine();
            int tienPhatSinh = Integer.parseInt(br.readLine());
            TienPhong_J07051 tienPhong = new TienPhong_J07051(tenKhachHang, soPhong, ngayNhanPhong, ngayTraPhong, tienPhatSinh);
            tienPhong.setMaKhachHang(String.format("KH%02d", i+1));
            list.add(tienPhong);
        }

        list.sort(J07051_TinhTienPhong::cmp);

        for(TienPhong_J07051 tienPhong : list) {
            System.out.println(tienPhong);
        }
    }
}

class TienPhong_J07051 {
    private String maKhachHang;
    private String tenKhachHang;
    private String ngayNhanPhong;
    private String ngayTraPhong;
    private int tienPhatSinh;
    private String soPhong;
    private long soNgayO;
    private long thanhTien;

    public TienPhong_J07051(String tenKhachHang, String soPhong, String ngayNhanPhong, String ngayTraPhong, int tienPhatSinh) {
        this.tenKhachHang = ChuanHoaTen(tenKhachHang);
        this.soPhong = soPhong;
        this.ngayNhanPhong = ChuanHoaNgayThang(ngayNhanPhong);
        this.ngayTraPhong = ChuanHoaNgayThang(ngayTraPhong);
        this.tienPhatSinh = tienPhatSinh;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(this.ngayNhanPhong, fmt);
        LocalDate d2 = LocalDate.parse(this.ngayTraPhong, fmt);
        this.soNgayO = ChronoUnit.DAYS.between(d1, d2) + 1;
        this.thanhTien = J07051_TinhTienPhong.giaPhong[soPhong.charAt(0) - '0'] * soNgayO + tienPhatSinh;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + tenKhachHang + " " + soPhong + " " + soNgayO + " " + thanhTien;
    }

    private String ChuanHoaNgayThang(String input) {
        String[] parts = input.split("/");
        int d = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        String res = String.format("%02d/%02d/%04d", d, m, y);
        return res;
    }

    private String ChuanHoaTen(String input) {
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(input);
        while (st.hasMoreTokens()) {
            String word = st.nextToken().toLowerCase().trim();
            StringBuilder Word = new StringBuilder(word);
            Word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
            res.append(Word + " ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public long getThanhTien() {
        return thanhTien;
    }
}
