class 없는_숫자_더하기_김현지 {
  public int solution(int[] numbers) {
      int answer = 45;
      for (int num : numbers) {
          answer -= num;
      }

      return answer;
  }
}