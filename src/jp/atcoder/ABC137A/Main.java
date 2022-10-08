package jp.atcoder.ABC137A;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abc137/tasks/abc137_a"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer = Math.max(Math.max(a + b, a - b), a * b);
    System.out.println(answer);
  }
}
