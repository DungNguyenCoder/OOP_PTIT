import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class J07046_DanhSachLuuTru {
    private static int cmp(KhachHang_J07046 a, KhachHang_J07046 b) {
        return a.getStayTime() > b.getStayTime() ? -1 : 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<KhachHang_J07046> ds = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++) {
            String name = br.readLine();
            String maPhong = br.readLine();
            String checkIn = br.readLine();
            String checkOut = br.readLine();
            KhachHang_J07046 loaiPhong = new KhachHang_J07046(name, maPhong, checkIn, checkOut);
            loaiPhong.SetMKH(String.format("KH%02d", i));
            ds.add(loaiPhong);
        }

        ds.sort(J07046_DanhSachLuuTru::cmp);

        for(KhachHang_J07046 tmp : ds){
            System.out.println(tmp);
        }
    }
}

class KhachHang_J07046 {
    private String MKH;
    private String name;
    private String maPhong;
    private String checkIn;
    private String checkOut;
    private long stayTime;

    public KhachHang_J07046(String name,  String maPhong, String checkIn, String checkOut) {
        this.name = name;
        this.maPhong = maPhong;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d1 = LocalDate.parse(checkIn, fmt);
        LocalDate d2 = LocalDate.parse(checkOut, fmt);
        this.stayTime = ChronoUnit.DAYS.between(d1, d2);
    }

    @Override
    public String toString() {
        return MKH + " " + name + " " + maPhong + " " + stayTime;
    }

    public void SetMKH(String MKH) {
        this.MKH = MKH;
    }
    public long getStayTime() {
        return stayTime;
    }
}
