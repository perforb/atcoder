package jp.atcoder.ABC173A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc125/tasks/abc125_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n % 1000 == 0) {
      System.out.println(0);
    } else {
      System.out.println(1000 - (n % 1000));
    }
  }
}
