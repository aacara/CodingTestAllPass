class Solution {
   public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int total = brown + yellow;
        for (int i = total - 2; i > 2; i--) {
            if (total % i == 0) {
                int c = total / i;
                if ((i - 2) * (c - 2) == yellow) {
                    answer = new int[]{i, c};
                    break;
                }
            }
        }
        return answer;
    }
}
