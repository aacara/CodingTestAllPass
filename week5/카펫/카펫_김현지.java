class 카펫_김현지 {
    static int horizontal;
    static int vertical;
    
    public int[] solution(int brown, int yellow) {
        getHorizontalAndVertical(brown, yellow);
        
        int[] answer = {horizontal, vertical};
        return answer;
    }
    
    private void getHorizontalAndVertical(int brown, int yellow) {
        double common = Math.sqrt(Math.pow(brown, 2) + 16 - 8 * brown - 16 * yellow);
        horizontal = (int)(brown + 4 + common) / 4;
        vertical = (int)(brown + 4 - common) / 4;
    }
}