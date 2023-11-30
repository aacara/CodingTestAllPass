package Week2.문자열압축;


class 문자열압축_김현지 {
    
    public int solution(String s) {
        
        int sLen = s.length();
        int maxPiece = sLen / 2;
        int piece = 0;
        int cnt;
        String previousStr, nowStr;
        int minLenCandidate;
        int minLen = sLen;
        

        
        while (piece < maxPiece) {
            minLenCandidate = sLen;
            cnt = 0;
            piece++;
            previousStr = s.substring(0, piece);
            
            for (int i = piece; i <= sLen - piece; i += piece) {
                nowStr = s.substring(i, i + piece);
                if (nowStr.equals(previousStr)) {
                    cnt++;
                } else {
                    previousStr = nowStr;
                    cnt = 0;
                }
                if (0 < cnt) {
                    minLenCandidate -= piece;
                }
                if (cnt == 1 || cnt == 9 || cnt == 99 || cnt == 999) {
                    minLenCandidate++;
                }
                 
                minLen = (minLen < minLenCandidate) ? minLen : minLenCandidate;
            }
        }
        
        
        int answer = minLen;
        return answer;
    }
}