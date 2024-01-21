import java.util.*;

class 두개뽑아서더하기_김현지 {
    private static Set<Integer> resultSet = new HashSet<>();
    private static int[] numbers;
    
    public int[] solution(int[] numbers) {
        this.numbers = numbers;
    
        possibleCombinations();
        int[] answer = changeSetToArr();
        Arrays.sort(answer);

        return answer;
    }
    
    private void possibleCombinations() {
        int numbersLen = numbers.length;
        for (int i = 0; i < numbersLen; i++) {
            for (int j = i+1; j < numbersLen; j++) {
                resultSet.add( numbers[i] + numbers[j]);
            }
        }
    }
    
    private int[] changeSetToArr() {
        int resultSetLen = resultSet.size();
        int[] answer = new int[resultSetLen];
        int i = 0;
        
        for (Integer value : resultSet) {
            answer[i++] = value;
        }
        
        return answer;
    }
}