package jp.atcoder.ABC087B;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        int X = Integer.parseInt(scanner.next());
        int result = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    int total = 500 * i + 100 * j + 50 * k;
                    if (total == X) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
