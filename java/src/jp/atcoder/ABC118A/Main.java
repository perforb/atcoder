package jp.atcoder.ABC118A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc118/tasks/abc118
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b % a == 0) {
      System.out.println(a + b);
    } else {
      System.out.println(b - a);
    }
  }
}
