package jp.atcoder.ABC197B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int x = sc.nextInt() - 1;
    int y = sc.nextInt() - 1;
    char[][] map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = sc.next().toCharArray();
    }

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, -1, 0, 1};
    int answer = 1;
    for (int i = 0; i < 4; i++) {
      int px = x;
      int py = y;
      while (true) {
        px += dx[i];
        py += dy[i];
        if (px < 0 || py < 0 || px >= h || py >= w) {
          break;
        }
        if (map[px][py] == '#') {
          break;
        }
        answer++;
      }
    }

    System.out.println(answer);
  }
}
