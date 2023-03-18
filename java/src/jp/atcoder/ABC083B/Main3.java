package jp.atcoder.ABC083B;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int answer = 0;
    for (int i = 1; i <= n; i++) {
      int sum = sumDigits(i);
      if (a <= sum && sum <= b) {
        answer += i;
      }
    }
    System.out.println(answer);
  }

  private static int sumDigits(int digit) {
    int sum = 0;
    while (digit > 0) {
      sum += digit % 10;
      digit /= 10;
    }
    return sum;
  }
}
