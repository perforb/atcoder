package jp.atcoder.ABC175B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] rods = new int[n];
    for (int i = 0; i < n; i++) {
      rods[i] = sc.nextInt();
    }

    Arrays.sort(rods);
    int answer = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (rods[i] == rods[j]) {
          continue;
        }
        for (int k = j + 1; k < n; k++) {
          if (rods[j] == rods[k]) {
            continue;
          }
          if (rods[i] + rods[j] > rods[k]) {
            answer++;
          }
        }
      }
    }

    System.out.println(answer);
  }
}
