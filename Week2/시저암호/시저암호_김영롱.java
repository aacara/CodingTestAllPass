package Week2.시저암호;

class 시저암호_김영롱 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
                continue;
            }

            char compareWith = Character.isUpperCase(c) ? 'Z' : 'z';
            int i = (c + n > compareWith) ? c + n - ('Z'- 'A' + 1) : c + n;
            sb.append((char) i);
        }

        return sb.toString();
    }
}