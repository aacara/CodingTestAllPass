package Week4.문자열다루기기본;

class 문자열다루기기본_김현지 {
    public boolean solution(String s) {
        
        int sLen = s.length();
        
        if (sLen != 4 && sLen != 6) {
            return false;
        }
        
        for (int i = 0; i< sLen; i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
}