import java.util.Scanner;

public class ThirdTest {
    public static int[][] triangle = new int[100][100];
    public static int n;
    public static int[][] max = new int[100][100];
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                triangle[i][j] = in.nextInt();
            }
        }
        
        for (i = 1; i <= n; i++) {
            max[n][i] = triangle[n][i];
        }
        
        for (i = n - 1; i >= 1 ; i--) {
            for (j = 1; j <= i; j++) {
                max[i][j] = max(max[i + 1][j], max[i + 1][j + 1]) + triangle[i][j];
            }
        }
        
        System.out.println(max[1][1]);
        in.close();
    }
    
    public static int max(int m, int n) {
        return m > n ? m : n;
    }
}
