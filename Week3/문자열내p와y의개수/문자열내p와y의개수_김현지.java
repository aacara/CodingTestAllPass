class 문자열내p와y의개수_김현지 {
    boolean solution(String s) {
        
        s = s.toLowerCase();
        int sLen = s.length();
        int pCnt = 0;
        int yCnt = 0;
        boolean answer = true;
        
        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) == 'p') {
                pCnt++;
            } else if (s.charAt(i) == 'y') {
                yCnt++;
            }
        }
        
        if (pCnt != yCnt) {
            answer = false;
        }
        return answer;
        
    }
}