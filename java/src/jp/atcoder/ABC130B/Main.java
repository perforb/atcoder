package jp.atcoder.ABC130B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] l = new int[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }

    int d = 0, count = 1;
    for (int i = 0; i < n; i++) {
      d += l[i];
      if (d > x) {
        break;
      }
      count++;
    }

    System.out.println(count);
  }
}
