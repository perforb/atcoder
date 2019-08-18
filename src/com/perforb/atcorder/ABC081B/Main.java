package com.perforb.atcorder.ABC081B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] A = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean even = true;
        int result = 0;
        while (even) {
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) {
                    even = false;
                    break;
                }
                A[i] = A[i] / 2;
            }
            if (even) {
                result++;
            }
        }
        System.out.println(result);
    }
}
