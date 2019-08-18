package com.perforb.atcorder.ABC083B;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int result = 0;
        for (int i = 1; i <= N; i++) {
            int j = i;
            int sum = 0;
            while (j != 0) {
                sum += j % 10;
                j /= 10;
            }
            if (A <= sum && sum <= B) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
