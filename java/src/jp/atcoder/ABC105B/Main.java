package jp.atcoder.ABC105B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < 100; i++) {
      for (int j = 0; j < 100; j++) {
        if (i * 4 + j * 7 == n) {
          found = true;
          break;
        }
      }
    }

    System.out.println(found ? "Yes" : "No");
  }
}
