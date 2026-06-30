package Loops;

import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("n ni kiriting: ");
        int n = input.nextInt();

        int kopaytma = 1;

        for (int raqam = 1; raqam <= n; raqam++) {
            kopaytma *= a;
        }

        System.out.println(kopaytma);
    }
}
