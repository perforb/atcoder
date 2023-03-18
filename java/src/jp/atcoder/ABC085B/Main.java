package jp.atcoder.ABC085B;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int result = 0, previous = 0;
    Integer[] numbers = new Integer[s.nextInt()];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = s.nextInt();
    }
    // int ではコンパイルエラーとなりソートできないため Integer としている
    Arrays.sort(numbers, Collections.reverseOrder());
    for (int number : numbers) {
      if (previous != number) {
        previous = number;
        result++;
      }
    }
    System.out.println(result);
  }
}
