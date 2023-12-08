package Week3.숫자문자열과영단어;

public class 숫자문자열과영단어_김영롱 {
    public int solution(String s) {
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}