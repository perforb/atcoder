package jp.atcoder.ABC081A;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    String[] s = scanner.next().split("");
//    int result = 0;
//    for (String value : s) {
//      if (value.equals("1")) {
//        result++;
//      }
//    }
//    System.out.println(result);
//  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int total = Arrays.stream(s.next().split(""))
      .mapToInt(Integer::valueOf)
      .sum();
    System.out.println(total);
  }
}
