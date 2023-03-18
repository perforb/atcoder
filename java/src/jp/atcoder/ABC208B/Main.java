package jp.atcoder.ABC208B;

import java.util.Scanner;
import java.util.stream.IntStream;

// TODO
public class Main {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt();
    int sum = 0, count = 0;
    for (int i = 10; i >= 1; i--) {
      int f = factorial(i);
      if (f > p) {
        continue;
      }
      while (sum + f <= p) {
        sum += f;
        count++;
      }
    }
    System.out.println(count);
  }

  private static int factorial(int n) {
    return IntStream.range(1, n + 1)
      .reduce(1, (a, b) -> a * b);
  }
}
