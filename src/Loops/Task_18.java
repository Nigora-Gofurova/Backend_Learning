package Loops;

import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N ni kiriting: ");
        int N = input.nextInt();

        for (int raqam = 0; raqam <= N; raqam++) {
            System.out.println("togri" + raqam + " = " + Math.sqrt(raqam));
        }
    }
}
