import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class J07050_SapXepMatHang {
    private static int cmp(MatHang_J07050 a, MatHang_J07050 b) {
        return Double.compare(b.getLoiNhuan(), a.getLoiNhuan());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<MatHang_J07050> ds = new ArrayList<>();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            String tenHang = br.readLine();
            String nhomHang = br.readLine();
            double giaMua = Double.parseDouble(br.readLine());
            double giaBan = Double.parseDouble(br.readLine());
            MatHang_J07050 mh = new MatHang_J07050(tenHang, nhomHang, giaMua, giaBan);
            mh.setMaHang(String.format("MH%02d", i+1));
            ds.add(mh);
        }

        ds.sort(J07050_SapXepMatHang::cmp);
        for(MatHang_J07050 tmp : ds){
            System.out.println(tmp);
        }
    }
}

class MatHang_J07050 {
    private String maHang;
    private String tenHang;
    private String nhomHang;
    private double giaMua;
    private double giaBan;
    private double loiNhuan;

    public MatHang_J07050(String tenHang, String nhomHang, double giaMua, double giaBan) {
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return maHang + " " + tenHang + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }
}
