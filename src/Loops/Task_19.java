package Loops;

import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int n = input.nextInt();

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Xonalar soni: " + count);
    }
}
