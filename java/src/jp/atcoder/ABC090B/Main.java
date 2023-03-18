package jp.atcoder.ABC090B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int answer = 0;
    for (int i = a; i <= b; i++) {
      String r = reverse(Integer.toString(i));
      if (Integer.toString(i).equals(r)) {
        answer++;
      }
    }

    System.out.println(answer);
  }

  private static String reverse(String number) {
    return new StringBuilder(number).reverse().toString();
  }
}
