package Problem_Solving_Day_4;

import java.util.Scanner;

public class Task_12 {

    public void Sonlar(double a, double b, double c) {

        if (a < b && a < c && b < c) {

            a = a * 2;
            b = b * 2;
            c = c * 2;

        } else if (a > b && a > c && b > c) {

            a = a * 2;
            b = b * 2;
            c = c * 2;

        } else {

            a = -a;
            b = -b;
            c = -c;
        }

        System.out.print(a + " " + b + " " + c);
    }

    public static void main(String[] args) {

        Task_12 myObj = new Task_12();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double a = input.nextDouble();

        System.out.print("Enter b number: ");
        double b = input.nextDouble();

        System.out.print("Enter c number: ");
        double c = input.nextDouble();

        myObj.Sonlar(a, b, c);
    }
}