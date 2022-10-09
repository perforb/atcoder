package jp.atcoder.ABC162B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long answer = 0;
    for (long i = 1; i <= n; i++) {
      if (skip(i)) {
        continue;
      }
      answer += i;
    }
    System.out.println(answer);
  }

  private static boolean skip(long n) {
    return n % 3 * 5 == 0 || n % 3 == 0 || n % 5 == 0;
  }
}
