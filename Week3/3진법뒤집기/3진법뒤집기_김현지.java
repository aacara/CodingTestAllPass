class 3진법뒤집기_김현지 {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer();
        
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        
        String reverseThree = sb.toString();
        
        int answer = 0;
        for (int i = 0; i < reverseThree.length(); i++) {
            answer += Integer.parseInt(String.valueOf(reverseThree.charAt(i))) * (int)Math.pow(3, reverseThree.length() - i - 1);
        }
        
        return answer;
    }
}