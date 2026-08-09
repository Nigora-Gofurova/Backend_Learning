package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_08 {

    public void Sonlar(int a, int b, int c) {

        if (a + b == c) {
            System.out.print("True");

        } else if (a + c == b) {
            System.out.print("True");

        } else if (b + c == a) {
            System.out.print("True");

        } else {
            System.out.print("False");
        }
    }

    public static void main(String[] args) {

        Task_08 myObj = new Task_08();

      Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        System.out.print("Enter c number: ");
        int c = input.nextInt();

        myObj.Sonlar(a, b, c);
    }
}
