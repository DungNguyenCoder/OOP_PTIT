import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine().trim());
        int tmp = 0;
        int cnt = 0;
        int cnt1 = 0;
        int cnt0 = 0;
        for(int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            cnt1 = 0;
            cnt0 = 0;
            for(int j = 1; j <= 3; j++) {
                tmp = Integer.parseInt(st.nextToken());
                if(tmp == 1)
                    ++cnt1;
                else
                    ++cnt0;
            }
            if(cnt1 > cnt0)
                ++cnt;
        }
        System.out.println(cnt);
    }
}
