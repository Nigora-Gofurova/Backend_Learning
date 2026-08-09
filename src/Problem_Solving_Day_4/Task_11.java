package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_11 {

    public void Sonlar(int a, int b, int c, int d, int e) {

        int summa = 0;

        if (a > 0 && a % 2 != 0) {
            summa = summa + a;
        }

        if (b > 0 && b % 2 != 0) {
            summa = summa + b;
        }

        if (c > 0 && c % 2 != 0) {
            summa = summa + c;
        }

        if (d > 0 && d % 2 != 0) {
            summa = summa + d;
        }

        if (e > 0 && e % 2 != 0) {
            summa = summa + e;
        }

        System.out.print(summa);
    }

    public static void main(String[] args) {

        Task_11 myObj = new Task_11();

       Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = input.nextInt();

        System.out.print("Enter b number: ");
        int b = input.nextInt();

        System.out.print("Enter c number: ");
        int c = input.nextInt();

        System.out.print("Enter d number: ");
        int d = input.nextInt();

        System.out.print("Enter e number: ");
        int e = input.nextInt();

        myObj.Sonlar(a, b, c, d, e);
    }
}
