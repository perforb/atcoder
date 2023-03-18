package jp.atcoder.ABC066B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    for (int i = s.length() - 1; i > 0; i--) {
      s = s.substring(0, i);
      String a = s.substring(0, i / 2);
      String b = s.substring(i / 2);
      if (a.equals(b)) {
        break;
      }
    }

    System.out.println(s.length());
  }
}
