import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class J07030_CapSoNguyenToTrongFile1 {
    private static boolean nt(int n) {
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        List<Integer> al1 = (ArrayList<Integer>) ois1.readObject();
        List<Integer> al2 = (ArrayList<Integer>) ois2.readObject();

        Set<Integer> se1 = new TreeSet<>();
        for(int i : al1) {
            if(nt(i)) {
                se1.add(i);
            }
        }
        Set<Integer> se2 = new TreeSet<>();
        for(int i : al2) {
            if(nt(i)) {
                se2.add(i);
            }
        }
        for (Integer i : se1) {
            if (i >= 1000000 - i) {
                break;
            }
            if (se2.contains(1000000 - i)) {
                System.out.println(i + " " + (1000000 - i));
            }
        }
    }
}
