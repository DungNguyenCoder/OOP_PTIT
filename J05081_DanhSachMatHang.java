import java.util.*;

public class J05081_DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            MatHang matHang = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            list.add(matHang);
        }
        Collections.sort(list);
        for (MatHang matHang : list) {
            System.out.println(matHang);
        }
        sc.close();
    }
}

class MatHang implements Comparable<MatHang> {
    private static int idx = 1;
    private String maMatHang;
    private String tenMatHang;
    private String donViTinh;
    private long giaMua;
    private long giaBan;
    private long loiNhuan;

    public MatHang(String tenMatHang, String donViTinh, long giaMua, long giaBan) {
        this.maMatHang = String.format("MH%03d", idx++);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public int compareTo(MatHang other) {
        int cmp = Long.compare(other.loiNhuan, this.loiNhuan);
        if (cmp == 0) {
            return this.maMatHang.compareTo(other.maMatHang);
        }
        return cmp;
    }

    @Override
    public String toString() {
        return this.maMatHang + " " + this.tenMatHang + " " + this.donViTinh + " " + this.giaMua + " " + this.giaBan + " " + this.loiNhuan;
    }
}