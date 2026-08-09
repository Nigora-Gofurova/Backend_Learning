package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_10 {
    public void Sonlar(int a, int b) {

        if (a * a == b) {
            System.out.print("True");

        } else if (b * b == a) {
            System.out.print("True");

        } else {
            System.out.print("False");
        }
    }

    public static void main(String[] args) {

        Task_10 myObj = new Task_10();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        myObj.Sonlar(a, b);
    }
}
