package com.perforb.atcorder.ABC081B;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int result = 0;
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        while (isAllEven(A)) {
            A = divideAll(A);
            result++;
        }
        System.out.println(result);
    }

    private static boolean isAllEven(int[] A) {
        return Arrays.stream(A).allMatch(i -> i % 2 == 0);
    }

    private static int[] divideAll(int[] A) {
        return Arrays.stream(A).map(i -> i / 2).toArray();
    }
}
