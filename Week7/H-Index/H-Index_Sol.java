import java.util.*;

public class H-Index_Sol {
  private boolean isValid(int[] citations, int h) {
    int index = citations.length - h;
    
    return citations[index] >= h;
  }

  public int Solution(int[] citations) {
    Arrays.sort(citations);
    for (int h = citations.length; h >= 1; h--) {
      if (isValid(citations, h)) {
        return h;
      }
    }
    return 0;
  }
}
