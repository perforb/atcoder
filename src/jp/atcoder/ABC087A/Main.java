package jp.atcoder.ABC087A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc087/tasks/abc087_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println((x - a) % b);
  }
}
