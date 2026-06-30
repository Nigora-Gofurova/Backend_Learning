package Loops;

import java.util.Scanner;

public class Task_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int raqam = 1; raqam <= 100; raqam++) {
            if (raqam % 2 != 0 && raqam % 3 == 0 && raqam % 5 != 0) {
                sum += raqam;
            }
        }

        System.out.println(sum);
    }
}
