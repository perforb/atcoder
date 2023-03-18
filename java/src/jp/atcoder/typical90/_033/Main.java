package jp.atcoder.typical90._033;

import java.util.Scanner;

// https://atcoder.jp/contests/typical90/tasks/typical90_ag
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    int answer;
    if (h == 1 || w == 1) {
      answer = h * w;
    } else {
      answer = count(h) * count(w);
    }

    System.out.println(answer);
  }

  private static int count(int n) {
    if (n % 2 == 0) {
      return n / 2;
    } else {
      return n / 2 + 1;
    }
  }
}
