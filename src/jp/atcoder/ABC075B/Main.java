package jp.atcoder.ABC075B;

import java.util.Scanner;

public class Main {

  // 上, 左上, 左, 左下, 下, 右下, 右, 右上
  private static final int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
  private static final int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] s = new char[h][w];

    for (int i = 0; i < h; i++) {
      String line = sc.next();
      char[] chars = line.toCharArray();
      System.arraycopy(chars, 0, s[i], 0, chars.length);
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (s[i][j] != '.') {
          continue;
        }
        int count = 0;
        for (int d = 0; d < 8; d++) {
          int ni = i + dx[d];
          int nj = j + dy[d];
          if (ni < 0 || ni >= h || nj < 0 || nj >= w) {
            continue;
          }
          if (s[ni][nj] == '#') {
            count++;
          }
        }
        char c = Character.forDigit(count, 10);
        s[i][j] = c;
      }
    }

    for (char[] chars : s) {
      for (char ch : chars) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
