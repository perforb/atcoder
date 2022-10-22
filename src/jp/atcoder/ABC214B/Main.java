package jp.atcoder.ABC214B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int t = sc.nextInt();
    int answer = 0;
    for (int a = 0; a <= s; a++) {
      for (int b = 0; b <= s - a; b++) {
        for (int c = 0; c <= s - a - b; c++) {
          if ((a + b + c) <= s && (a * b * c) <= t) {
            answer++;
          }
        }
      }
    }
    System.out.println(answer);
  }
}
