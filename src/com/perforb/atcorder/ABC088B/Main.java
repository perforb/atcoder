package com.perforb.atcorder.ABC088B;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        Integer[] a = new Integer[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        Arrays.sort(a, Comparator.reverseOrder());
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
