import java.util.*;

class 등굣길_김현지 {
    public int solution(int m, int n, int[][] puddles) {
        final int MOD = 1_000_000_007;
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        
        for (int[] puddle : puddles) {
            dp[puddle[1]-1][puddle[0]-1] = -1;
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == -1 || (i == 0 && j == 0)) {
                    continue;
                }
                
                int fromLeft = 0;
                int fromTop = 0;
                
                if (i > 0 && dp[i - 1][j] != -1) {
                    fromTop = dp[i - 1][j];
                }
                
                if (j > 0 && dp[i][j - 1] != -1) {
                    fromLeft = dp[i][j - 1];
                }
                
                dp[i][j] = (fromLeft + fromTop) % MOD;
            }                                                                                                                                                          
        }

        return dp[n - 1][m - 1];
    }
}