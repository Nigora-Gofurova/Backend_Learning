package Loops;

import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a ni kiriting: ");
        int a = input.nextInt();

        System.out.print("b ni kiriting: ");
        int b = input.nextInt();

        int sum = 0;

        for (int raqam = a + 1; raqam < b; raqam++) {
            sum += raqam;
        }
        System.out.println(sum);
    }
}
