package jp.atcoder.ABC153A;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abc153/tasks/abc153_a"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    if (h % a == 0) {
      System.out.println(h / a);
    } else {
      System.out.println(h / a + 1);
    }
  }
}
