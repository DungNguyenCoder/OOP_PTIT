import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class J07029_SoNguyenToLonNhatTrongFile {
    private static boolean nt(int n) {
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer i : l) {
            if(nt(i)) {
                mp.put(i, mp.getOrDefault(i, 0) + 1);
            }
        }
        int cnt = 0;
        for(Integer i : mp.descendingKeySet()) {
            System.out.println(i + " " + mp.get(i));
            ++cnt;
            if(cnt == 10) {
                break;
            }
        }
    }
}
