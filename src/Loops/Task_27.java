package Loops;

import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        int ekub = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ekub = i;
            }
        }

        System.out.println("EKUB: " + ekub);
    }
}
