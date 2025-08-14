import java.util.ArrayList;
import java.util.Scanner;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if((list.get(i) + list.get(i + 1)) % 2 == 0) {
                list.remove(i + 1);
                list.remove(i);
                i = -1;
                n = list.size();
            }
            for(int j = 0; j < n; j++) {
                if(list.get(j) % 2 != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        System.out.println(list.size());
    }
}
