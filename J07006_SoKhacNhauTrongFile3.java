import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class J07006_SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> l = (ArrayList<Integer>) ois.readObject();
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for (Integer i : l) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        for (Integer i : mp.keySet()) {
            System.out.println(i + " " + mp.get(i));
        }
    }
}
