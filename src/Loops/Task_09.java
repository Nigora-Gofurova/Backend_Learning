package Loops;

import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopaytma = 1;

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        while (son != 0) {
            kopaytma *= son;

            System.out.print("Son kiriting: ");
            son = input.nextInt();
        }

        System.out.println("Ko'paytma: " + kopaytma);
    }
}