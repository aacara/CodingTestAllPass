package Week2.시저암호;


class 시저암호_김현지 {
    public String solution(String s, int n) {
        

        int sLen = s.length();
        char[] charArr = new char[sLen];
        int originalNum, pushedNum;
        char pushedAlpha;

        
        for (int i = 0; i < sLen; i++) {
            
            originalNum = s.charAt(i);
            pushedNum = originalNum + n;
            
            // System.out.println(originalNum);

            // 공백
            if (originalNum == 32) {
                pushedNum -= n;
            }
            
            // 소문자
            if (65 <= originalNum && originalNum <= 90 && 90 < pushedNum) {
                pushedNum -= 26;
            }
            // 대문자
            if (97 <= originalNum && originalNum <= 122 && 122 < pushedNum) {
                pushedNum -= 26;
            }
            
            pushedAlpha = (char)pushedNum;
            charArr[i] = pushedAlpha;
        }
        
        String answer = String.valueOf(charArr);
        
        return answer;
    }
}