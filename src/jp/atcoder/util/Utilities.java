package jp.atcoder.util;

public class Utilities {

  private static long gcd(long a, long b) {
    if (a < b) {
      long tmp = a;
      a = b;
      b = tmp;
    }
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  private static long lcm(long a, long b) {
    return a * b / gcd(b, a % b);
  }
}
