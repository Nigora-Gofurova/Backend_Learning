package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_09 {

    public void sonlar() {

        System.out.println("Toq sonlar:");

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Juft sonlar:");

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Task_09 obj = new Task_09();

        obj.sonlar();
    }
}