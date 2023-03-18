package jp.atcoder.ABC133B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] p = new int[n][d];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < d; j++) {
        p[i][j] = sc.nextInt();
      }
    }

    int answer = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int distance = 0;
        for (int k = 0; k < d; k++) {
          int x = p[i][k];
          int y = p[j][k];
          distance += Math.pow(x - y, 2);
        }
        if (Math.sqrt(distance) % 1 == 0) {
          answer++;
        }
      }
    }

    System.out.println(answer);
  }
}
