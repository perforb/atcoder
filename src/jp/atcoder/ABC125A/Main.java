package jp.atcoder.ABC125A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc125/tasks/abc125_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = sc.nextInt();

    System.out.println(t / a * b);
  }
}
