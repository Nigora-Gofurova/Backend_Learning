package Loops;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        int count = 0;

        for (int raqam = a; raqam <= b; raqam++) {
            System.out.print(raqam + " ");
            count++;
        }

        System.out.println();
        System.out.println("Soni: " + count);
    }
}
