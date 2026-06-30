package Loops;

import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = input.nextInt();

        while (n != 0) {
            int raqam = n % 10;
            System.out.print(raqam);

            n = n / 10;
        }
    }
}
