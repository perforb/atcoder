package jp.atcoder.ABC093B;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    Set<Integer> set = new TreeSet<>();

    for (int i = a; i <= b && i < a + k; i++) {
      set.add(i);
    }
    for (int i = b; i >= a && i > b - k; i--) {
      set.add(i);
    }

    for (int n : set) {
      System.out.println(n);
    }
  }
}
