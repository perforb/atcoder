package com.perforb.atcorder.ABC088B;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] a = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int Alice = 0;
        int Bob = 0;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                Alice += a[i];
            } else {
                Bob += a[i];
            }
        }
        System.out.println(Alice - Bob);
    }
}
