import java.util.*;

class 정수_삼각형_김현지 {
    public int solution(int[][] triangle) {
        int height = triangle.length;
        int[][] dp = new int[height][];
        
        dp[0] = triangle[0]; 
        for (int i = 1; i < height; i++) {
            dp[i] = new int[i+1];
        }
        
        for (int i = 0; i <= height - 2; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i + 1][j] = Math.max(dp[i + 1][j] , triangle[i + 1][j] + dp[i][j]);
                dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], triangle[i + 1][j + 1] + dp[i][j]);
            }
        }

        int[] lastLine = dp[height - 1];
        Arrays.sort(lastLine);
        int answer = lastLine[height - 1];
        return answer;
    }
}