package jp.atcoder.ABC095B;

import java.util.Scanner;

public class Main {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int min = 1000;
    int answer = 0;
    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      min = Math.min(m, min);
      x -= m;
      answer++;
    }

    while (x >= min) {
      x -= min;
      answer++;
    }

    System.out.println(answer);
  }
}
