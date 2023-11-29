package Week2.이상한문자만들기;


class 이상한문자만들기_김현지 {
    public String solution(String s) {
        
        String[] sArr = s.split("");
        int sLen = sArr.length;
        String answer = "";
        
        int actualIdx = 0;
        for (int i = 0; i < sLen; i++) {
            if (sArr[i].equals(" ")) {
                answer += " ";
                actualIdx = 0;
                continue;
            } 
            if (actualIdx % 2 == 0) {
                sArr[i] = sArr[i].toUpperCase();
            } else if (actualIdx % 2 == 1) {
                sArr[i] = sArr[i].toLowerCase();
            }
            answer += sArr[i];
            actualIdx++;

        }
        return answer;
    }
}