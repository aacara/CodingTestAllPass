import java.util.Arrays;

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][];
        for (int i = 0; i < triangle.length; i++) {
            dp[i] = new int[i + 1];
        }

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (0 <= j - 1) {
                    if (j < dp[i - 1].length) {
                        dp[i][j] = Math.max(dp[i - 1][j] + triangle[i][j], dp[i - 1][j - 1] + triangle[i][j]);
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                    }
                } else {
                    dp[i][j] = triangle[i][j] + dp[i - 1][j];
                }
            }
        }

        return Arrays.stream(dp[triangle.length - 1]).max().orElse(-1);
    }
}
