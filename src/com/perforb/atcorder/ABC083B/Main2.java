package com.perforb.atcorder.ABC083B;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String[] numbers = String.valueOf(i).split("");
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            if (A <= sum && sum <= B) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
