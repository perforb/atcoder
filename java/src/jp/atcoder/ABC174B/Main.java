package jp.atcoder.ABC174B;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abc174/tasks/abc174_b"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long d = sc.nextLong();
    int answer = 0;
    for (int i = 0; i < n; i++) {
      long x = sc.nextInt();
      long y = sc.nextInt();
      if (x * x + y * y <= d * d ) {
        answer++;
      }
    }
    System.out.println(answer);
  }
}
