package jp.atcoder.ABC128A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc128/tasks/abc128_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int p = sc.nextInt();

    System.out.println((a * 3 + p) / 2);
  }
}
