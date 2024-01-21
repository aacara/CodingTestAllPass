package Week7.K번째수;

import java.util.*;

class K번째수_김현지 {
    private static int[] array;
    private static int[][] commands;
    
    public int[] solution(int[] array, int[][] commands) {
        this.array = array;
        int commandLen = commands.length;
        int[] answer = new int[commandLen];
        
        for (int i = 0; i < commandLen; i++) {
            int[] command = commands[i];
            int[] cutArray = cutArr(command);
            Arrays.sort(cutArray);
            answer[i] = findJthNum(cutArray, command);
        }

        return answer;
    }
    
    private int[] cutArr(int[] command) {
        int i = command[0] - 1;
        int j = command[1];
        
        return Arrays.copyOfRange(array, i, j);
    }
    
    private int findJthNum(int[] array, int[] command) {
        int k = command[2] - 1;
        
        return array[k];
    }
}