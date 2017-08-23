import java.util.Scanner;

public class FirstTest {
    
    public static int[][] triangle = new int[100][100];
    public static int n = 0;
    public static void main(String[] args) {
        
        int i;
        int j;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                triangle[i][j] = in.nextInt();
            }
        }
        
        System.out.println(maxSum(1, 1));
        in.close();
    }
    
    public static int maxSum(int i, int j) {
        if (i == n) return triangle[i][j];
        
        int x = maxSum(i + 1, j);
        int y = maxSum(i + 1, j + 1);
        
        return max(x, y) + triangle[i][j];
    }
    
    public static int max(int m, int n) {
        return m > n ? m : n;
    }
}
