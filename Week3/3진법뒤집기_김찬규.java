class Solution {
    public int solution(int n) {
		long reversedTernary = Long.parseLong(new StringBuilder(Integer.toString(n, 3)).reverse().toString());
		int count = 0;
		int answer = 0;
		while (reversedTernary > 0) {
			answer += (int)((reversedTernary % 10) * Math.pow(3, count));
			reversedTernary /= 10;
			count++;
		}
		return answer;
	}
}
