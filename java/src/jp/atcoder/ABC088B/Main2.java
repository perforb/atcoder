package jp.atcoder.ABC088B;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        List<Integer> a = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int Alice = 0;
        int Bob = 0;

        while (true) {
            int max_a = max(a);
            Alice += a.remove(max_a);
            if (a.isEmpty()) {
                break;
            }
            int max_b = max(a);
            Bob += a.remove(max_b);
            if (a.isEmpty()) {
                break;
            }
        }

        System.out.println(Alice - Bob);
    }

    private static int max(List<Integer> a) {
        int index = 0;
        int max = a.get(index);
        for (int i = 1; i < a.size(); i++) {
            int a_i = a.get(i);
            if (max < a_i) {
                max = a_i;
                index = i;
            }
        }
        return index;
    }
}
