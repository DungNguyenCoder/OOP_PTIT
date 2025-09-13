import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class J07048_DanhSachSanPham2 {
    private static int cmp(SanPham_J07048 a, SanPham_J07048 b){
        if(a.getGiaBan() != b.getGiaBan()){
            return b.getGiaBan() - a.getGiaBan();
        }
        else {
            return a.getMaSP().compareTo(b.getMaSP());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));

        List<SanPham_J07048> ds = new ArrayList<SanPham_J07048>();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String maSP = br.readLine();
            String tenSP = br.readLine();
            int giaBan = Integer.parseInt(br.readLine());
            int baoHanh = Integer.parseInt(br.readLine());

            SanPham_J07048 sp = new SanPham_J07048(maSP, tenSP, giaBan, baoHanh);
            ds.add(sp);
        }

        ds.sort(J07048_DanhSachSanPham2::cmp);

        for(SanPham_J07048 tmp : ds){
            System.out.println(tmp);
        }
    }
}
class SanPham_J07048 {
    private String maSP;
    private String tenSP;
    private int giaBan;
    private int baoHanh;

    public SanPham_J07048(String maSP, String tenSP, int giaBan, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + giaBan + " " + baoHanh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public String getMaSP() {
        return maSP;
    }
}
