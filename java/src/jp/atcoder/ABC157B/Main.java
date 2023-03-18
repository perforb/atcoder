package jp.atcoder.ABC157B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = 3;
    int[][] a = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    int n = sc.nextInt();
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    boolean[][] bucket = new boolean[size][size];
    for (int number : b) {
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          if (a[i][j] == number) {
            bucket[i][j] = true;
          }
        }
      }
    }

    boolean horizontal = false;
    boolean vertical = false;
    for (int i = 0; i < size; i++) {
      boolean horizontalLine = true;
      boolean verticalLine = true;
      for (int j = 0; j < size; j++) {
        horizontalLine &= bucket[i][j];
        verticalLine &= bucket[j][i];
      }
      if (horizontalLine) {
        horizontal = true;
        break;
      }
      if (verticalLine) {
        vertical = true;
        break;
      }
    }

    boolean diagonalLeft = true;
    for (int i = 0, j = 0; i < size; i += 1, j += 1) {
      diagonalLeft &= bucket[i][j];
    }

    boolean diagonalRight = true;
    for (int i = 0, j = size - 1; i < size; i += 1, j -= 1) {
      diagonalRight &= bucket[i][j];
    }

    System.out.println(horizontal || vertical || diagonalLeft || diagonalRight
      ? "Yes" : "No");
  }
}
