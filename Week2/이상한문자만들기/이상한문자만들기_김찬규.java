import java.util.Arrays;

class Solution {
    StringBuilder sb;

	public String solution(String s) {
		sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count = 0;
				sb.append(s.charAt(i));

			} else {
				if (count % 2 == 0) {
					sb.append(Character.toUpperCase(s.charAt(i)));
					count++;
					continue;
				}
				sb.append(Character.toLowerCase(s.charAt(i)));
				count++;
			}
		}
		return sb.toString();
	}
}
