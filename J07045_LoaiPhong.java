import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class J07045_LoaiPhong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong> {
    private String kiHieu;
    private String tenPhong;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong(String line) {
        StringTokenizer st = new StringTokenizer(line);
        this.kiHieu = st.nextToken();
        this.tenPhong = st.nextToken();
        this.donGia = Integer.parseInt(st.nextToken());
        this.phiPhucVu = Double.parseDouble(st.nextToken());
    }

    @Override
    public int compareTo(LoaiPhong other) {
        return this.tenPhong.compareTo(other.tenPhong);
    }

    @Override
    public String toString() {
        return kiHieu + " " + tenPhong + " " + donGia + " " + phiPhucVu;
    }
}
