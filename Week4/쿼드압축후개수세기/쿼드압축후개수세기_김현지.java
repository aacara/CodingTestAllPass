package Week4.쿼드압축후개수세기;

public class 쿼드압축후개수세기_김현지 {
  
  static int zeros = 0;
  static int ones = 0;
  static int[][] arr;

  public int[] solution(int[][] arr) {
    this.arr = arr;
    int arrLen = arr.length;
    int totalSize = (int)Math.pow(arrLen, 2);
    
    countZerosAndOnes();
    if (zeros == totalSize) {
        return new int[]{1, 0};
    } else if (ones == totalSize) {
        return new int[]{0, 1};
    }
    compress(0, arrLen, 0, arrLen);

    int[] answer = {zeros, ones};
    return answer;
  }

  private void countZerosAndOnes() {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0) {
          zeros++;
        } else {
          ones++;
        }
      }
    }
  }

  private void compress(int xStart, int xEnd, int yStart, int yEnd) {
    int xMiddle = (xStart + xEnd)/2;
    int yMiddle = (yStart + yEnd)/2;

    boolean isCompressed = compressDividedSquare(xStart, xMiddle, yStart, yMiddle);
    if (!isCompressed) {
      compress(xStart, xMiddle, yStart, yMiddle);
    }
    isCompressed = compressDividedSquare(xStart, xMiddle, yMiddle, yEnd);
    if (!isCompressed) {
      compress(xStart, xMiddle, yMiddle, yEnd);
    }
    isCompressed = compressDividedSquare(xMiddle, xEnd, yStart, yMiddle);
    if (!isCompressed) {
      compress(xMiddle, xEnd, yStart, yMiddle);
    }
    isCompressed = compressDividedSquare(xMiddle, xEnd, yMiddle, yEnd);
    if (!isCompressed) {
      compress(xMiddle, xEnd, yMiddle, yEnd);
    }
  }

  private boolean compressDividedSquare(int xStart, int xEnd, int yStart, int yEnd) {
    int startVal = arr[xStart][yStart];

    for (int i = xStart; i < xEnd; i++) {
      for (int j = yStart; j < yEnd; j++) {
        if (arr[i][j] != startVal) {
          return false;
        }
      }
    }
    if (startVal == 0) {
      zeros -= (Math.pow((xEnd - xStart), 2) - 1);
    } else {
        ones -= (Math.pow((xEnd - xStart), 2) - 1);
    }
    
    return true;
  }
}
