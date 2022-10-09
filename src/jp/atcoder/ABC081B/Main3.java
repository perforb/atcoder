package jp.atcoder.ABC081B;

import java.util.Scanner;

public class Main3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), count = 0;
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (; allEven(a); count++) {
      toHalf(a);
    }

    System.out.println(count);
  }

  private static boolean allEven(int[] a) {
    for (int i : a) {
      if (i % 2 != 0) {
        return false;
      }
    }
    return true;
  }

  private static void toHalf(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] / 2;
    }
  }
}
