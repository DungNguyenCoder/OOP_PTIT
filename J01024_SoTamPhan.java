import java.util.Scanner;

public class J01024_SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            boolean flag = true;
            for(char x : s.toCharArray()) {
                if(x != '1' && x != '2' && x != '0') {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

