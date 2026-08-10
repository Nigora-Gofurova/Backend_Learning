package Problem_Solving_Day_5;

import java.util.Scanner;

public class Task_04 {
    public void sonlar(int a, int b) {

        if (a != b) {

            int sum = a + b;

            a = sum;
            b = sum;

        } else {

            a = 0;
            b = 0;
        }

        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {

        Task_04 obj = new Task_04();

       Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();

        System.out.print("b: ");
        int b = input.nextInt();

        obj.sonlar(a, b);
    }
}

