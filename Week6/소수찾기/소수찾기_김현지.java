package Week6.소수찾기;

import java.util.*;

class 소수찾기_김현지 {
    static String[] strNumbers;
    static int numbersLen;
    static boolean[] visited;
    static Set<Integer> uniqueNumbers = new HashSet<>();
    static int count = 0;
    
    public int solution(String numbers) {
        convertStrToIntArr(numbers);
        makeCombination("", 0);
        
        return count;
    }
    
    private void convertStrToIntArr(String numbers) {
        numbersLen = numbers.length();
        strNumbers = numbers.split("");
        visited = new boolean[numbersLen];
        
    }
    
    private void makeCombination(String current, int index) {
        if (!current.isEmpty()) {
            int num = Integer.parseInt(current);
            if (isPrimeNumber(num) && uniqueNumbers.add(num)) {
                count++;
            }
        }
        if (index == numbersLen) {
            return;
        }
        for (int i = 0; i < numbersLen; i++) {
            if (!visited[i]) {
                visited[i] = true;
                makeCombination(current + strNumbers[i], index + 1);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
