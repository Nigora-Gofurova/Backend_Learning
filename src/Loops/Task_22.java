package Loops;

import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n ni kiriting: ");
        int n = input.nextInt();

        double kopaytma = 1;

        for (int i = 1; i <= n; i++) {
            kopaytma *= (1 + i / 10.0);
        }
        System.out.println("Natija: " + kopaytma);
    }
}
