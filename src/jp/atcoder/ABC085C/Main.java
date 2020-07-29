package jp.atcoder.ABC085C;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abs/tasks/abc085_c"
 * @see "https://ikatakos.com/pot/programming_algorithm/contest_history/atcoder/2018/0107_abc085"
 */
public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int Y = s.nextInt();
    int x = -1, y = -1, z = -1;

    OUTER:
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= (N - i); j++) {
        int total = 10000 * i + 5000 * j + 1000 * (N - i - j);
        if (total == Y) {
          x = i;
          y = j;
          z = (N - i - j);
          break OUTER;
        }
      }
    }

    System.out.printf("%d %d %d", x, y, z);
  }
}
