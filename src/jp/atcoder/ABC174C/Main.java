package jp.atcoder.ABC174C;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abc174/tasks/abc174_c"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = 7;
    int result = -1;
    for (int i = 1; i <= k; i++) {
      if (x % k == 0) {
        result = i;
        break;
      }
      x = (x * 10 + 7) % k;
    }
    System.out.println(result);
  }
}
