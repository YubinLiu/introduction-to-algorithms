import java.util.Scanner;

public class SecondTest {
    
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
                max[i][j] = -1;
            }
        }
        
        System.out.println(maxSum(1, 1));
        in.close();
    }
    
    public static int maxSum(int i, int j) {
        if (max[i][j] != -1) return max[i][j];
        
        if (i == n) max[i][j] = triangle[i][j];
        else {
            int x = maxSum(i + 1, j);
            int y = maxSum(i + 1, j + 1);
            max[i][j] = max(x, y) + triangle[i][j];
        }
        
        return max[i][j];
    }
    
    public static int max(int m, int n) {
        return m > n ? m : n;
    }
}
