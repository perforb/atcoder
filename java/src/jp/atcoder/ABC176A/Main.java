package jp.atcoder.ABC176A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();

    if (n % x == 0) {
      System.out.println(n / x * t);
    } else {
      System.out.println((n / x + 1) * t);
    }
  }
}
