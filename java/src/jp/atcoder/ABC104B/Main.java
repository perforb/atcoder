package jp.atcoder.ABC104B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] chars = s.toCharArray();
    boolean result = isA(chars) && hasC(chars) && allLowerCase(chars);
    System.out.println(result ? "AC" : "WA");
  }

  private static boolean isA(char[] chars) {
    return chars[0] == 'A';
  }

  private static boolean hasC(char[] chars) {
    int count = 0;
    for (int i = 2; i < chars.length - 1; i++) {
      if (chars[i] == 'C') {
        count++;
      }
    }
    return count == 1;
  }

  private static boolean allLowerCase(char[] chars) {
    for (char ch : chars) {
      if (ch == 'A' || ch == 'C') {
        continue;
      }
      if (!Character.isLowerCase(ch)) {
        return false;
      }
    }
    return true;
  }
}
