package jp.atcoder.ABC157A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc157/tasks/abc157_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 2 == 0) {
      System.out.println(n / 2);
    } else {
      System.out.println(n / 2 + 1);
    }
  }
}
