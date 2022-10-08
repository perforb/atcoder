package jp.atcoder.ABC175A;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abc175/tasks/abc175_a"
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // e.g. SSSSSRSRRRRRRSRSSRSRSRS
    String s = sc.next();
    int answer = 0;
    for (String w : s.split("S")) {
      answer = Math.max(answer, w.length());
    }
    System.out.println(answer); // => 6
  }
}
