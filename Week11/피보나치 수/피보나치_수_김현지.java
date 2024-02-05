import java.util.*;

class 피보나치_수_김현지 {
    public int solution(int n) {
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }
        
        return dp[n];
    }
}