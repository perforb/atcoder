package jp.atcoder.ABC085C;

import java.util.Scanner;

public class Main2 {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();

    int x = -1;
    int y = -1;
    int z = -1;

    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N; j++) {
        int k = N - i - j;
        if (k < 0) {
          continue;
        }
        if (i * 10000 + j * 5000 + k * 1000 == Y) {
          x = i;
          y = j;
          z = k;
          break;
        }
      }
    }

    System.out.printf("%d %d %d", x, y, z);
  }
}
