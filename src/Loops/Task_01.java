package Loops;

import java.util.Scanner;

public class Task_01 {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Toq sonlar: ");

        for (int raqam = 1; raqam <= 100; raqam++) {
            if (raqam % 2 != 0) {
                System.out.print(raqam + " ");
            }
        }

        System.out.println();

        System.out.print("Juft sonlar: ");

        for (int raqam = 1; raqam <= 100; raqam++) {
            if (raqam % 2 == 0) {
                System.out.print(raqam + " ");
            }
        }
    }
}
