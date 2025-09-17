import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class J07072_ChuanHoaVaSapXep {
    private static int cmp(String a, String b) {
        String[] partsA = a.split(" ");
        String[] partsB = b.split(" ");
        if(!partsA[partsA.length-1].equals(partsB[partsB.length-1])) {
            return partsA[partsA.length-1].compareTo(partsB[partsB.length-1]);
        }
        else {
            if(!partsA[0].equals(partsB[0])) {
                return partsA[0].compareTo(partsB[0]);
            }
            else {
                String demA = String.join(" ", java.util.Arrays.copyOfRange(partsA, 1, partsA.length - 1));
                String demB = String.join(" ", java.util.Arrays.copyOfRange(partsB, 1, partsB.length - 1));
                return demA.compareTo(demB);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("DANHSACH.in"));
        String line = null;
        List<String> ds = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line.trim());
            StringBuilder ans = new StringBuilder();
            while (st.hasMoreTokens()) {
                StringBuilder word = new StringBuilder(st.nextToken().toLowerCase());
                word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
                ans.append(word + " ");
            }
            ans.deleteCharAt(ans.length() - 1);
            ds.add(ans.toString());
        }
        ds.sort(J07072_ChuanHoaVaSapXep::cmp);
        for (String d : ds) {
            System.out.println(d);
        }
    }
}
