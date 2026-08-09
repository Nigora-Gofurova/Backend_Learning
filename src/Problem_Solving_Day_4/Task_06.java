package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_06 {
    public void Sonlar(int a, int b) {

        if (a > 21 && b > 21) {
            System.out.print(0);

        } else if (a > 21) {
            System.out.print(b);

        } else if (b > 21) {
            System.out.print(a);

        } else if (a >= b) {
            System.out.print(a);

        } else if (b >= a) {
            System.out.print(b);
        }
    }

    public static void main(String[] args) {

        Task_06 myObj = new Task_06();

       Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        myObj.Sonlar(a, b);
    }
}
