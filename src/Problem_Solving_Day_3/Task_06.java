package Problem_Solving_Day_3;

import java.util.Scanner;

public class Task_06 {

    public void differentNumbers(int a, int b, int c) {

        if (a == b && b == c) {
            System.out.println("=");
        } else {

            if (a != b && a != c) {
                System.out.print(a + " ");
            }

            if (b != a && b != c) {
                System.out.print(b + " ");
            }

            if (c != a && c != b) {
                System.out.print(c + " ");
            }

        }

    }

    public static void main(String[] args) {

        Task_06 myObj = new Task_06();

       Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();

        System.out.print("b = ");
        int b = input.nextInt();

        System.out.print("c = ");
        int c = input.nextInt();

        myObj.differentNumbers(a, b, c);

    }

}
