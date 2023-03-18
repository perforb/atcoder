package jp.atcoder.ABC218B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] answer = new char[26];
    int[] p = new int[26];
    for (int i = 0; i < 26; i++) {
      p[i] = sc.nextInt();
    }
    for (int i = 0; i < 26; i++) {
      answer[i] = alphabets[p[i] - 1];
    }
    System.out.println(new String(answer));
  }
}
