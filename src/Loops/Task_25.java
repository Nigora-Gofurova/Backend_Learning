package Loops;

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = input.nextInt();

        boolean bor = false;

        while (n != 0) {
            int raqam = n % 10;

            if (raqam == 5) {
                bor = true;
            }
            n = n / 10;
        }
        if (bor) {
            System.out.println("5 bor");
        } else {
            System.out.println("5 yo'q");
        }
    }
}
