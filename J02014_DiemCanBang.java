import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sumRight = 0;
            for(int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sumRight += a[i];
            }
            int sumLeft = a[0];
            boolean flag = false;
            for(int i = 0; i < n - 1; i++) {
                if(sumLeft == sumRight) {
                    System.out.println(i + 1);
                    flag = true;
                    break;
                }
                sumLeft += a[i + 1];
                sumRight -= a[i];
            }
            if(!flag) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
//1 2 3 4  5
//0 1 3 6 10 15

