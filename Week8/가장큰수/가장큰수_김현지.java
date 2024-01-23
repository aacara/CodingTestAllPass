package Week8.가장큰수;

import java.util.*;

class Solution {
    public int[] 가장큰수_김현지(int[] array) {
        int[] beforeArray  = array.clone();
        Arrays.sort(array);
        int arrLen = array.length;
        int largestNum = array[arrLen - 1];
        int largestIdx = 0;
        
        for (int i = 0; i < arrLen; i++) {
            if (beforeArray[i] == largestNum) {
                largestIdx = i;
                break;
            }
        }
        
        int[] answer = {largestNum, largestIdx};
        return answer;
    }
}