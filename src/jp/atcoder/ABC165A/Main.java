package jp.atcoder.ABC165A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    boolean found = false;
    for (; a <= b; a++) {
      if (a % k == 0) {
        found = true;
        break;
      }
    }
    System.out.println(found ? "OK" : "NG");
  }
}
