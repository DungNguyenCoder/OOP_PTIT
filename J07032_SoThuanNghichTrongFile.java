import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07032_SoThuanNghichTrongFile {
    private static boolean tn(int n) {
        int rev = 0;
        int tmp = n;
        int cnt = 0;
        while(tmp != 0) {
            ++cnt;
            if((tmp % 10) % 2 == 0)
                return false;
            rev = rev * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        return rev == n && cnt > 1 && cnt % 2 == 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] f1 = new int[1000005];
        int[] f2 = new int[1000005];

        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> al1 = (ArrayList<Integer>) ois1.readObject();

        for(int i : al1) {
            if(tn(i)) {
                f1[i]++;
            }
        }

        ois1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        al1 = (ArrayList<Integer>) ois1.readObject();

        for(int i : al1) {
            if(tn(i)) {
                f2[i]++;
            }
        }
        int out = 0;
        for(int i = 0; i < 1000005; i++) {
            if(f1[i] > 0 && f2[i] > 0) {
                ++out;
                System.out.println(i + " " + (f1[i] + f2[i]));
            }
            if (out == 10) {
                break;
            }
        }
    }
}
