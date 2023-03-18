package jp.atcoder.ABC220B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String a = sc.next();
    String b = sc.next();
    long answer = Long.parseLong(a, k) * Long.parseLong(b, k);
    System.out.println(answer);
  }

  private static long convert(int base, long n) {
    long result = 0;
    for (int i = 0; n > 0; i++) {
      result += (n % 10) * Math.pow(base, i);
      n /= 10;
    }
    return result;
  }
}
