package jp.atcoder.ABC084B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    String[] p = s.split("-");
    boolean valid = p.length == 2
      && p[0].length() == a
      && p[1].length() == b;

    System.out.println(valid ? "Yes" : "No");
  }
}
