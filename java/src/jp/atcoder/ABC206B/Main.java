package jp.atcoder.ABC206B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int day = 0, sum = 0;
    while (sum < n) {
      sum += ++day;
    }
    System.out.println(day);
  }
}
