import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class J03009_TapTuKhacBietCuaHaiXau {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            TreeSet<String> set1 = new TreeSet<String>();
            st = new StringTokenizer(br.readLine().trim());
            while(st.hasMoreTokens()) {
                set1.add(st.nextToken());
            }
            ArrayList<String> list1 = new ArrayList<>(set1);

            TreeSet<String> set2 = new TreeSet<String>();
            st = new StringTokenizer(br.readLine().trim());
            while(st.hasMoreTokens()) {
                set2.add(st.nextToken());
            }
            ArrayList<String> list2 = new ArrayList<>(set2);

            for(int i = 0; i < list1.size(); i++) {
                boolean flag = true;
                for(int j = 0; j < list2.size(); j++) {
                    if(list1.get(i).equals(list2.get(j))) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    System.out.printf("%s ", list1.get(i));
                }
            }
            System.out.println();
        }
    }
}
