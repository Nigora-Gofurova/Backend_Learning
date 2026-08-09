package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_05 {
    public void sonlar(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.print(0);

        } else if (a == b) {
            System.out.print(c);

        } else if (a == c) {
            System.out.print(b);

        } else if (b == c) {
            System.out.print(a);

        } else {
            System.out.print(a * b * c);
        }
    }

    public static void main(String[] args) {

        Task_05 obj = new Task_05();

       Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        obj.sonlar(a, b, c);
    }
}
