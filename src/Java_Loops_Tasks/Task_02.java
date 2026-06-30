package Java_Loops_Tasks;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Raqam kiriting : ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number+ " x " + i + " = " + (number * i));
        }
    }
}
