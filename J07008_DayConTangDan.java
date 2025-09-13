import java.io.*;
import java.util.*;

public class J07008_DayConTangDan {

    private static int n;
    private static int[] a;
    private static List<String> res = new ArrayList<>();

    private static void backtrack(int start, List<Integer> cur) {
        if (cur.size() > 1) {
            StringBuilder sb = new StringBuilder();
            for (int x : cur) {
                sb.append(x).append(" ");
            }
            sb.setLength(sb.length() - 1);
            res.add(sb.toString());
        }
        for (int i = start; i < n; i++) {
            if (cur.isEmpty() || a[i] > cur.get(cur.size() - 1)) {
                cur.add(a[i]);
                backtrack(i + 1, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"))) {
            n = Integer.parseInt(br.readLine());
            a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
        }

        backtrack(0, new ArrayList<>());

        Collections.sort(res);
        for (String s : res) {
            System.out.println(s);
        }
    }
}
