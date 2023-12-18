import java.util.ArrayList;

public class Solution {
	String[] words;
	ArrayList<String> list = new ArrayList<>();

	public int solution(String word) {
		words = new String[] {"A", "E", "I", "O", "U"};
		myRecursive("", 0);
		return list.indexOf(word) + 1; // 인덱스에다가 1을 더해야 n번째 문자열임에 유의
	}

	private void myRecursive(String target, int depth) {
		if (!target.isEmpty()) {
			list.add(target);
		}
		if (depth == 5) {
			return;
		}
		for (String word : words) {
			myRecursive(target + word, depth + 1);
		}
	}
}
