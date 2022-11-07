package jp.atcoder.ABC177B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int answer = t.length();

    for (int i = 0; i <= s.length() - t.length(); i++) {
      int count = 0;
      for (int j = 0; j < t.length(); j++) {
        if (s.charAt(i + j) != t.charAt(j)) {
          count++;
        }
      }
      answer = Math.min(count, answer);
    }

    System.out.println(answer);;
  }
}
