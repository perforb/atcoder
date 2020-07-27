package jp.atcoder.ABC081A;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int total = Arrays.stream(s.next().split(""))
      .mapToInt(Integer::valueOf)
      .sum();
    System.out.println(total);
  }
}
