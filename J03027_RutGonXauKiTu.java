import java.util.Scanner;

public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) {
                s.deleteCharAt(i - 1);
                s.deleteCharAt(i - 1);
                if(i > 1)
                    i -= 2;
                else if(i == 1)
                    i = 0;
            }
        }
        if(s.length() == 0) {
            System.out.println("Empty String");
        }
        else {
            System.out.println(s);
        }
    }
}
