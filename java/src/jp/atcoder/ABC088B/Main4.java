package jp.atcoder.ABC088B;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> cards = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      cards.add(sc.nextInt());
    }

    cards.sort(Comparator.reverseOrder());

    int alice = 0, bob = 0;
    for (int i = 0; i < cards.size(); i++) {
      if (i % 2 == 0) {
        alice += cards.get(i);
      } else {
        bob += cards.get(i);
      }
    }

    System.out.println(alice - bob);
  }
}
