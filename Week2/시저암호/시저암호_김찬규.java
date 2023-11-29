class Solution {
    public String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c == ' ') {
				sb.append(c);
			} else {
				if (Character.isLowerCase(c)) {
					if (c + n > 122)
						sb.append(Character.toString((c + n) % 123 + 97));
					else
						sb.append(Character.toString((c + n) % 123));
				} else {
					if (c + n > 90) {
						sb.append(Character.toString((c + n) % 91 + 65));
					} else {
						sb.append(Character.toString((c + n) % 91));
					}
				}
			}
		}
		return sb.toString();
	}
}
