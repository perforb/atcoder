package jp.atcoder.ABC064A;

import java.util.Scanner;

// https://atcoder.jp/contests/abc087/tasks/abc087_a
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String r = sc.next();
    String g = sc.next();
    String b = sc.next();

    int rgb = Integer.parseInt(r + g + b);
    System.out.println(rgb % 4 == 0 ? "YES" : "NO");
  }
}
