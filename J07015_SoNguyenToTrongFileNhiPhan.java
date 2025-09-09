import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class J07015_SoNguyenToTrongFileNhiPhan {
    private static boolean nt(int n) {
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer i : l) {
            if(nt(i)) {
                mp.put(i, mp.getOrDefault(i, 0) + 1);
            }
        }
        ois.close();
        for (Integer i : mp.keySet()) {
            System.out.println(i + " " + mp.get(i));
        }
    }
}
