class 모음사전_김현지 {
    static String word;
    static String[] arr;
    static String possibleWord = "";
    static int cnt = 0;
    
    public int solution(String word) {
        this.word = word;
        arr = new String [] {"A", "E", "I", "O", "U"};
        makeWord();

        return cnt;
    }
    
    private void makeWord() {
        if (possibleWord.equals(word)) {
            return;
        }
        if (possibleWord.length() == 5) { 
             return;
        }
        for (int i = 0; i < 5; i++) {
            possibleWord += arr[i];
            cnt++;
            makeWord();
            if (possibleWord.equals(word)) {
                return;
            }
            possibleWord = possibleWord.substring(0, possibleWord.length() - 1);
        }
    }
}