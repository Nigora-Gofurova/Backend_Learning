package Loops;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int N = input.nextInt();

        int count = 0;

        for (int raqam = 1; raqam <= N; raqam++) {
            if (N % raqam == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("Tub son");
        } else {
            System.out.println("Tub emas");
        }
    }
}
