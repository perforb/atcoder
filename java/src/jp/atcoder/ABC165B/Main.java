package jp.atcoder.ABC165B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long later = 0, sum = 100;
    while (sum < x) {
      sum += compoundInterest(sum);
      later++;
    }
    System.out.println(later);
  }

  private static long compoundInterest(long base) {
    return base / 100;
  }
}
