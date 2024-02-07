import java.util.Arrays;

class 피보나치_수_김영롱 {
    private final int[] result = new int[1000001];

    private int fibonacci(int n) {
        if (result[n] != -1) return result[n];
        if (n == 0 || n == 1) return n;

        result[n] = (fibonacci(n - 2) + fibonacci(n - 1)) % 1234567;

        return result[n];
    }

    public int solution(int n) {
        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {
            fibonacci(i);
        }

        return fibonacci(n);
    }
}
