package Week2.이상한문자만들기;

public class 이상한문자만들기_김영롱 {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(words[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
            if(i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}