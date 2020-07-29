package jp.atcoder.ABC049C;

import java.util.Scanner;

/**
 * @see "https://atcoder.jp/contests/abs/tasks/arc065_a"
 * @see "https://atcoder.jp/contests/abs/submissions/15408375"
 * @see "https://atcoder.jp/contests/abs/submissions/12814555"
 */
public class Main2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String result = "YES";
    while (!"".equals(S)) {
      if (S.endsWith("dreamer")) {
        S = S.substring(0, S.lastIndexOf("dreamer"));
      } else if (S.endsWith("dream")) {
        S = S.substring(0, S.lastIndexOf("dream"));
      } else if (S.endsWith("eraser")) {
        S = S.substring(0, S.lastIndexOf("eraser"));
      } else if (S.endsWith("erase")) {
        S = S.substring(0, S.lastIndexOf("erase"));
      } else {
        result = "NO";
        break;
      }
    }
    System.out.println(result);
  }
}
