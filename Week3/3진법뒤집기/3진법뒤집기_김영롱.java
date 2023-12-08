public class 3진법뒤집기_김영롱 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        String reversed = sb.reverse().toString();

        return Integer.parseInt(reversed, 3);
    }
}