package jp.atcoder.ABC068B;

import java.util.Scanner;

public class Main {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 0, answer = 1;
    for (int i = 1; i <= n; i++) {
      int count = count(i);
      if (max < count) {
        max = count;
        answer = i;
      }
    }
    System.out.println(answer);
  }

  private static int count(int number) {
    int count = 0;
    while (number > 1) {
      if (number % 2 == 0) {
        count++;
      }
      number /= 2;
    }
    return count;
  }
}
