package Loops;

import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Son kiriting: ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        while (n != 0) {
            int raqam = n % 10;

            sum += raqam;
            count++;

            n = n / 10;
        }
        System.out.println("Yig'indi: " + sum);
        System.out.println("Raqamlar soni: " + count);
    }
}
