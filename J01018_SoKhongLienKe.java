import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            boolean check = true;
            int sum = 0;
            for(int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                if(i != s.length() - 1) {
                    if(Math.abs(s.charAt(i) - s.charAt(i + 1)) != 2) {
                        check = false;
                        break;
                    }
                }
            }
            if(check && sum % 10 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
