package jp.atcoder.ABC146B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < alphabets.length; i++) {
      map.put(alphabets[i], i);
    }
    char[] answer = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      int index = map.get(s.charAt(i));
      answer[i] = alphabets[(index + n) % 26];
    }
    System.out.println(new String(answer));
  }
}
