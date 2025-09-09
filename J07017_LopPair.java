import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07017_LopPair {
    static class Pair<U, V> {
        public U first;
        public V second;
        public Pair(U first, V second) {
            this.first = first;
            this.second = second;
        }

        private boolean nt(int n) {
            for(int i = 2; i * i <= n; i++) {
                if(n%i == 0) {
                    return false;
                }
            }
            return n > 1;
        }

        public boolean isPrime() {
            if(first instanceof Integer && second instanceof Integer) {
                return nt((Integer) first) && nt((Integer) second);
            }
            return false;
        }

        @Override
        public String toString() {
            return first + " " + second;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
