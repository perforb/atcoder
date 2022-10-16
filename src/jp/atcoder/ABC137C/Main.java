package jp.atcoder.ABC137C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<String, Long> counter = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String s = sortedString(sc.next());
      counter.putIfAbsent(s, 0L);
      counter.computeIfPresent(s, (k, v) -> v + 1);
    }

    long answer = 0;
    for (long count : counter.values()) {
      answer += count * (count - 1) / 2;
    }

    System.out.println(answer);
  }

  private static String sortedString(String s) {
    char[] chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
