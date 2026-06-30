package Loops;

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a sonini kiriting : ");
        int a = input.nextInt();
        System.out.print("b sonini kiriting : ");
        int b = input.nextInt();

        int kopaytma = 1;

        for (int raqam = a; raqam <= b; raqam++) {
            kopaytma *= raqam;
        }

        System.out.println(kopaytma);
    }
}
