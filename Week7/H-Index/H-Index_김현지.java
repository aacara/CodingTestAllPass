import java.util.*;

class H-Index_김현지 {
    private static int[] citations;
    
    public int solution(int[] citations) {
        this.citations = citations;
        
        Arrays.sort(citations);
        
        return getMaxH();
    }
    
    private int getMaxH() {
        int citationsLen = citations.length;
        
        for (int i = 0; i < citationsLen; i++) {
            if (citations[i] >= citationsLen - i) {
                return citationsLen - i;
            }
        }
        
        return 0;
    }
}