package Loops;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int N = input.nextInt();

        for (int son = 2; son <= N; son++) {
            int count = 0;

            for (int i = 1; i <= son; i++) {
                if (son % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(son);
            }
        }
    }
}
