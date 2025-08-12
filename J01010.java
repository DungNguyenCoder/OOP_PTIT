import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- != 0) {
            boolean check = true;
            String line = sc.nextLine();
            long ans = 0;
            for(char c : line.toCharArray()) {
                if(c == '0')
                    ans = ans * 10;
                else if(c == '1')
                    ans = ans * 10 + c - '0';
                else if(c == '8' || c == '9')
                    ans = ans * 10;
                else {
                    check = false;
                    break;
                }
            }
            if(!check || ans == 0) {
                System.out.println("INVALID");
            }
            else {
                System.out.println(ans);
            }
        }
        sc.close();
    }
}
