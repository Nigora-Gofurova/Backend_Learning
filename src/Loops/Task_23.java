package Loops;

import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        System.out.print("Son kiriting: ");
        int son = input.nextInt();

        while (son >= 0) {

            if (son % 5 == 0) {
                count++;
            }
            System.out.print("Son kiriting: ");
            son = input.nextInt();
        }
        System.out.println("Jami: " + count);
    }
}
