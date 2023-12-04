class Solution {
int[] answer = new int[2];

	public int[] solution(String s) {
		while (!s.equals("1")) {
			s = countZero(s);
			answer[0] += 1;
		}
		return answer;
	}

	private String countZero(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == '0') {
				count++;
				continue;
			}
			sb.append(c);
		}
		answer[1] += count;
		return Integer.toBinaryString(sb.toString().length());
	}
}
