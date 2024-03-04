import java.util.*;

class 사칙연산_김현지 {
    public int solution(String arr[]) {
        int n = arr.length / 2 + 1;
        int[][] maxDp = new int[n][n];
        int[][] minDp = new int[n][n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i * 2]);
            maxDp[i][i] = num;
            minDp[i][i] = num;
        }
        
        for (int len = 2; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                maxDp[start][end] = Integer.MIN_VALUE;
                minDp[start][end] = Integer.MAX_VALUE;
                for (int mid = start; mid < end; mid++) {
                    String operator = arr[mid * 2 + 1];
                    int[] results = new int[] {
                        calculate(maxDp[start][mid], maxDp[mid + 1][end], operator),
                        calculate(maxDp[start][mid], minDp[mid + 1][end], operator),
                        calculate(minDp[start][mid], maxDp[mid + 1][end], operator),
                        calculate(minDp[start][mid], minDp[mid + 1][end], operator)
                    };
                    
                    for (int result : results) {
                        maxDp[start][end] = Math.max(maxDp[start][end], result);
                        minDp[start][end] = Math.min(minDp[start][end], result);
                    }
                }
            }
        }
        return maxDp[0][n-1];
    }
    
    private int calculate(int a, int b, String operator) {
        if (operator.equals("+")) {
            return a + b;
        } 
        return a - b;
    }
}