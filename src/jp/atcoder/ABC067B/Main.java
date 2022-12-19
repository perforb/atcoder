package jp.atcoder.ABC067B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Integer[] l = new Integer[n];
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l, Collections.reverseOrder());
    int answer = 0;
    for (int i = 0; i < k; i++) {
      answer += l[i];
    }
    System.out.println(answer);
  }
}
