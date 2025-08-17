import java.math.BigInteger;
import java.util.Scanner;

public class J03021_DienThoaiCucGach {
    private static char chuyenDoi(char kitu) {
        if(kitu == 'A' || kitu == 'B' || kitu == 'C')   return '2';
        else if(kitu == 'D' || kitu == 'E' || kitu == 'F') return '3';
        else if(kitu == 'G' || kitu == 'H' || kitu == 'I') return '4';
        else if(kitu == 'J' || kitu == 'K' || kitu == 'L') return '5';
        else if(kitu == 'M' || kitu == 'N' || kitu == 'O') return '6';
        else if(kitu == 'P' || kitu == 'Q' || kitu == 'R' || kitu == 'S') return '7';
        else if(kitu == 'T' || kitu == 'U' || kitu == 'V') return '8';
        else return '9';
    }

    private static boolean tn(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = chuyenDoi(s.charAt(i));
            res.append(c);
        }
        int l = 0;
        int r = res.length() - 1;
        while(l < r) {
            if(res.charAt(l) != res.charAt(r)) {
                return false;
            }
            ++l;
            --r;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine().toUpperCase();
            if(tn(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
