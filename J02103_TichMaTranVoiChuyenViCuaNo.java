import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] c = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    for(int k = 0; k < m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", test);
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.printf("%d ", c[i][j]);
                }
                System.out.println();
            }
        }
    }
}
