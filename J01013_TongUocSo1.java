import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J01013_TongUocSo1 {
    static int a[] = new int[2000001];

    public static void Era() {
        for (int i = 2; i * i <= 2000000; i++)
            if (a[i] == 0)
                for (int j = i * i; j <= 2000000; j += i)
                    a[j] = i;
        for (int i = 2; i <= 2000000; i++)
            if (a[i] == 0)
                a[i] = i;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Era();
        Long s = 0L;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            while (n != 1) {
                s += a[n];
                n /= a[n];
            }
        }
        System.out.print(s);
    }
}
