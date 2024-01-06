package Week6.불량사용자;

import java.util.*;

public class 불량사용자_김현지 {

  static String[] userId;
  static String[] bannedId;
  static boolean[] visited;
  static Set<Set<String>> resultSet;

  public int solution(String[] user_id, String[] banned_id) {
    this.userId = user_id;
    this.bannedId = banned_id;
    this.visited = new boolean[userId.length];
    this.resultSet = new HashSet<>();

    dfs(0, new HashSet<>());

    return resultSet.size();
  }

  private void dfs(int index, Set<String> currentSet) {
    int bannedLen = bannedId.length;
    int userIdLen = userId.length;

    if (index == bannedLen) {
      resultSet.add(new HashSet<>(currentSet));
      return;
    }

    for (int i = 0; i < userIdLen; i++) {
      if (!visited[i] && compare(userId[i], bannedId[index])) {
        visited[i] = true;
        currentSet.add(userId[i]);

        dfs(index + 1, currentSet);

        visited[i] = false;
        currentSet.remove(userId[i]);
      }
    }
  }

  private boolean compare(String user, String banned) {
    int userLen = user.length();
    int bannedLen = banned.length();

    if (userLen != bannedLen) {
      return false;
    }

    for (int i = 0; i < userLen; i++) {
      if (banned.charAt(i) != '*' && user.charAt(i) != banned.charAt(i)) {
        return false;
      }
    }

    return true;
  }
  
}
