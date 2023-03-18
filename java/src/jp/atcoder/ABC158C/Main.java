package jp.atcoder.ABC158C;

import java.util.Scanner;

public class Main {

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int price = -1;
    int maxPrice = withoutTax(100, 8);

    for (int i = 1; i <= maxPrice; i++) {
      int eight = tax(i, 8);
      int ten = tax(i, 10);
      if (eight == a && ten == b) {
        price = i;
        break;
      }
    }

    System.out.println(price);
  }

  private static int tax(int price, int taxRate) {
    return price * taxRate / 100;
  }

  private static int withoutTax(int tax, int taxRate) {
    return tax * 100 / taxRate;
  }
}
