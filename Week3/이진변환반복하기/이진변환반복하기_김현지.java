class 이진변환반복하기_김현지 {
    
    static int deletedZeroNum = 0;
    static StringBuffer sb;
    
    
    public int[] solution(String s) {
        int cnt = 0;
        
        while (!s.equals("1")) {
            String sAfterRemoval = removeZeros(s);
            s = convertToBinary(sAfterRemoval);
            cnt++;
        }
        
        int[] answer = {cnt, deletedZeroNum};
        return answer;
    }
    
    private static String removeZeros(String s) {
        int sLenBeforeRemoval = s.length();
        int sLenAfterRemoval;
        
        s = s.replace("0", "");
        sLenAfterRemoval = s.length();
        deletedZeroNum += sLenBeforeRemoval - sLenAfterRemoval;
        return s;
    }
    
    private static String convertToBinary(String s) {
        int sLenAfterRemoval = s.length();
        sb = new StringBuffer();
        
        while (sLenAfterRemoval > 0) {
            sb.append(sLenAfterRemoval % 2);
            sLenAfterRemoval /= 2;
        }
        sb.reverse();
        
        return sb.toString();
    }
}