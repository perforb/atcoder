package jp.atcoder.ABC081A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.next().split("");
        int result = 0;
        for (String value : s) {
            if (value.equals("1")) {
                result++;
            }
        }
        System.out.println(result);
    }
}
